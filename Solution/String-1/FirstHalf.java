/*
【問題】
偶数長の文字列[str]が与えられます。
文字列の前半部分を返してください。

【例】
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

【コンパイル＆回答チェック方法】
> java Test FirstHalf
*/

public class FirstHalf{
	public static String firstHalf(String str) {
		// ここに回答を記入
		return str.substring(0, str.length()/2);
	}
}
