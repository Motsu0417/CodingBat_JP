/*
【問題】
文字列[str]と整数[n]が与えられます。
[str]の先頭[n]文字と末尾[n]文字を連結した新しい文字列を返してください。
なお、文字列は[n]文字以上です。

【例】
nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"

【コンパイル＆回答チェック方法】
> java Test NTwice
*/

public class NTwice{
	public static String nTwice(String str, int n) {
		// ここに回答を記入
		return str.substring(0, n) + str.substring(str.length()-n);
	}
}
