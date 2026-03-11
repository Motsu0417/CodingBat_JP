/*
【問題】
文字列[str]と自然数[n]が与えられます。
[str]を[n]回繰り返した新しい文字列を返してください。

【例】
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"

【コンパイル＆回答チェック方法】
> java Test StringTimes
*/

public class StringTimes{
    public static String stringTimes(String str, int n) {
        // ここに回答を記入
        String newStr = "";
        for(int i = 0;i < n;i++)newStr += str;
        return newStr;
    }
}
