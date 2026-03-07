/*
【問題】
文字列[str]が与えられます。
[str]の最後の文字を文字列の先頭と最後に付け加えた新しい文字列を返してください。

【例】
backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"

【コンパイル＆回答チェック方法】
> java Test BackAround
*/

public class BackAround {
    public static String backAround(String str) {
        // ここに回答を記入
        if(str.length() < 1) return str;
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
}
