/*
【問題】
文字列[str]が与えられます。
先頭2文字と末尾2文字が等しい場合、先頭の2文字を削除した新しい文字列を返してください。
なお、先頭と末尾は重複してもよいものとし、文字列が2文字なら返り値は空文字[""]となります。
また、条件に一致しない場合はそのままの文字列を返してください。

【例】
without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""

【コンパイル＆回答チェック方法】
> java Test Without2
*/

public class Without2{
	public static String without2(String str) {
		// ここに回答を記入
		return ((str.length() > 1) && (str.startsWith(str.substring(str.length()-2)))) ? str.substring(2) : str; 
	}
}
