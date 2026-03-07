/*
【問題】
文字列[str]が与えられます。[str]に["not "]をくっつけた新しい文字列を返してください。
もしもともと["not "]が先頭についているときはそのまま返してください。

【例】
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad

【コンパイル＆回答チェック方法】
> java Test NotString
*/

public class NotString {
    public static String notString(String str) {
        // ここに回答を記入
        return (str.startsWith("not")) ? str : ("not " + str);
    }
}
