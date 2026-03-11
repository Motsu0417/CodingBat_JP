/*
【問題】
文字列[str]が与えられます。
先頭2文字と末尾2文字が等しい場合[true]を返してください。
なお、先頭と末尾は重複してもよいものとします。

【例】
frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true

【コンパイル＆回答チェック方法】
> java Test FrontAgain
*/

public class FrontAgain{
	public static boolean frontAgain(String str) {
		// ここに回答を記入
		return (str.length() > 1) && (str.startsWith(str.substring(str.length()-2)));
	}
}
