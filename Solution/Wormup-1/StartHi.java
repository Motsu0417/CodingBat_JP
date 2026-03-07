/*
【問題】
文字列[str]が与えられます。
[str]が["hi"]で始まるなら[true]、それ以外なら[false]を返してください。

【例】
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

【コンパイル＆回答チェック方法】
> java Test StartHi
*/

public class StartHi {
    public static boolean startHi(String str) {
        // ここに回答を記入
        return str.startsWith("hi");
    }
}
