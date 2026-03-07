/*
【問題】
[str]という文字列が与えられます。
最初の文字と最後の文字を入れ替えた文字列を返してください。

【例】
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

【コンパイル＆回答チェック方法】
> java Test FrontBack
*/

public class FrontBack {
    public static String frontBack(String str) {
        // ここに回答を記入
        if (str.length() < 2) {
            return str;
        }
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }
}
