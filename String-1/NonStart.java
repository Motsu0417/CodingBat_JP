/*
【問題】
2つの文字列が与えられます。2つの文字列の先頭文字を除いた文字列を連結した新しい文字列を返してください。
なお、文字列の長さは1文字以上です。

【例】
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"

【コンパイル＆回答チェック方法】
> java Test NonStart
*/

public class NonStart{
	public static String nonStart(String a, String b) {
		// ここに回答を記入
		return a.substring(1) + b.substring(1);
	}
}
