/*
【問題】
文字列[str]が与えられます。[str]の最初の3文字を"先頭部分"とします。
"先頭部分"を3回繰り返した新しい文字列を返してください。
なお、[str]の長さが3文字未満の場合は文字列のすべての部分を"先頭部分"とします

【例】
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"

【コンパイル＆回答チェック方法】
> java Test Front3
*/

public class Front3 {
    public static String front3(String str) {
        // ここに回答を記入
        String front = str.length() < 3 ? str : str.substring(0,3);
        return front + front + front;
    }
}
