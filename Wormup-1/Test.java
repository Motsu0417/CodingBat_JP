import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("クラス名が指定されていません。");
            System.out.println("利用方法: java Test [問題クラス名]");
            return;
        }

        String className = args[0];

        // ターゲットのクラスをコンパイルする
        if (!compileTargetClass(className)) {
            return;
        }

        try {
            Method targetMethod = resolveTargetMethod(className);
            List<TestCase> cases = loadCases(className, targetMethod);
            runCases(className, targetMethod, cases);
        } catch (Exception e) {
            System.err.println("テスト実行中にエラーが発生しました: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static boolean compileTargetClass(String className) {
        try {
            ProcessBuilder pb = new ProcessBuilder("javac", className + ".java");
            pb.redirectErrorStream(true);
            Process p = pb.start();

            // エラーの際にエラーを表示する
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println("-> " + line);
            }

            int result = p.waitFor();

            if (result == 0) {
                System.out.println("コンパイル成功: " + className + ".java テストを実施します。");
                return true;
            }
            
            System.err.println("コンパイル失敗: " + className + ".java エラーを参考に、コードを修正してください。");
            return false;
        } catch (Exception e) {
            System.err.println("コンパイル中にエラーが発生しました。ごめんなさい。: " + e.getMessage());
            return false;
        }
    }

    private static Method resolveTargetMethod(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        String methodName = lowerCamel(className);

        for (Method method : clazz.getMethods()) {
            if (method.getName().equals(methodName) && Modifier.isStatic(method.getModifiers())) {
                return method;
            }
        }

        throw new NoSuchMethodException(
            "public static メソッド '" + methodName + "' が見つかりません。"
        );
    }

    private static List<TestCase> loadCases(String className, Method method) throws IOException {
        Path caseFile = findCaseFile(className);
        List<String> lines = Files.readAllLines(caseFile);
        List<TestCase> testCases = new ArrayList<>();

        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> returnType = method.getReturnType();

        int lineNo = 0;
        for (String rawLine : lines) {
            lineNo++;
            String line = rawLine.trim();

            if (line.isEmpty() || line.startsWith("#")) {
                continue;
            }

            List<String> tokens = splitCsv(line);
            if (tokens.size() != parameterTypes.length + 1) {
                throw new IllegalArgumentException(
                    "ケースファイルの列数が不正です: line " + lineNo +
                    " (期待: " + (parameterTypes.length + 1) + "列)"
                );
            }

            Object expected = parseValue(tokens.get(0), returnType);
            Object[] args = new Object[parameterTypes.length];

            try{
                for (int i = 0; i < parameterTypes.length; i++) {
                    args[i] = parseValue(tokens.get(i + 1), parameterTypes[i]);
                }
            }catch(Exception e){
                throw new IllegalArgumentException("テストケースが正しくありません。");
            }
            

            testCases.add(new TestCase(expected, args));
        }

        if (testCases.isEmpty()) {
            throw new IllegalArgumentException("有効なテストケースが 1 件もありません。");
        }

        return testCases;
    }

    private static Path findCaseFile(String className) {
        Path p1 = Paths.get("cases", className + ".csv");
        if (Files.exists(p1)) {
            return p1;
        }

        Path p2 = Paths.get("Wormup-1", "cases", className + ".csv");
        if (Files.exists(p2)) {
            return p2;
        }

        throw new IllegalArgumentException(
            "ケースファイルが見つかりません: cases/" + className + ".csv"
        );
    }

    private static void runCases(String className, Method method, List<TestCase> cases) throws Exception {
        System.out.println("テスト対象: " + className + "." + method.getName());
        // System.out.println("形式: expected,arg1,arg2,...");

        int pass = 0;
        int total = cases.size();

        for (int i = 0; i < total; i++) {
            TestCase c = cases.get(i);
            Object actual = method.invoke(null, c.args);
            boolean ok = isEqual(c.expected, actual);

            if (ok) {
                pass++;
            }

            System.out.printf(
                "  case %02d/%02d: %s(%s) -> %s | 実行値 = %s | %s%n",
                i + 1,
                total,
                method.getName(),
                argsToString(c.args),
                valueToString(c.expected),
                valueToString(actual),
                ok ? "OK" : "NG"
            );
        }

        System.out.printf("結果: %d/%d passed%n%s%n", pass, total, pass == total ? "**課題クリアおめでとう！**" : "**残念、再挑戦してみよう！**");
    }

    private static List<String> splitCsv(String line) {
        List<String> fields = new ArrayList<>();
        StringBuilder field = new StringBuilder();
        boolean inQuotes = false;
        boolean fieldQuoted = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (inQuotes) {
                if (c == '"') {
                    if (i + 1 < line.length() && line.charAt(i + 1) == '"') {
                        field.append('"');
                        i++;
                    } else {
                        inQuotes = false;
                    }
                } else {
                    field.append(c);
                }
                continue;
            }

            if (c == ',') {
                fields.add(fieldQuoted ? field.toString() : field.toString().trim());
                field.setLength(0);
                fieldQuoted = false;
                continue;
            }

            if (c == '"') {
                if (field.toString().trim().isEmpty()) {
                    field.setLength(0);
                    inQuotes = true;
                    fieldQuoted = true;
                } else {
                    throw new IllegalArgumentException("不正なダブルクオートを検出しました: " + line);
                }
                continue;
            }

            field.append(c);
        }

        if (inQuotes) {
            throw new IllegalArgumentException("ダブルクオートが閉じられていません: " + line);
        }

        fields.add(fieldQuoted ? field.toString() : field.toString().trim());
        return fields;
    }

    private static Object parseValue(String token, Class<?> type) {
        if (type == int.class || type == Integer.class) {
            return Integer.parseInt(token);
        }
        if (type == boolean.class || type == Boolean.class) {
            return Boolean.parseBoolean(token);
        }
        if (type == long.class || type == Long.class) {
            return Long.parseLong(token);
        }
        if (type == double.class || type == Double.class) {
            return Double.parseDouble(token);
        }
        if (type == String.class) {
            return token;
        }

        throw new IllegalArgumentException("未対応の型です: " + type.getName());
    }

    private static String lowerCamel(String className) {
        if (className == null || className.isEmpty()) {
            return className;
        }
        return Character.toLowerCase(className.charAt(0)) + className.substring(1);
    }

    private static boolean isEqual(Object expected, Object actual) {
        if (expected == null) {
            return actual == null;
        }
        return expected.equals(actual);
    }

    private static String argsToString(Object[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(valueToString(args[i]));
        }
        return sb.toString();
    }

    private static String valueToString(Object value) {
        return value == null ? "null" : value.toString();
    }

    private static class TestCase {
        final Object expected;
        final Object[] args;

        TestCase(Object expected, Object[] args) {
            this.expected = expected;
            this.args = args;
        }
    }
}
