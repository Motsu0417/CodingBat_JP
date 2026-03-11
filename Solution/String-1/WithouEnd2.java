/*
【問題】
文字列が与えられます。文字列の先頭と末尾の文字を除いた文字列を返してください。
なお、文字列は0文字を含む任意の長さです。

【例】
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""

【コンパイル＆回答チェック方法】
> java Test WithouEnd2
*/

public class WithouEnd2{
	public static String withouEnd2(String str) {
		// ここに回答を記入
		return (str.length() < 3) ? "" : str.substring(1, str.length()-1);
	}
}
