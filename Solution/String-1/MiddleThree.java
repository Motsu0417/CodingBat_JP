/*
【問題】
長さが奇数の文字列が与えられます。中央の3文字を返してください。
なお、文字列は3文字以上です。

【例】
middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"

【コンパイル＆回答チェック方法】
> java Test MiddleThree
*/

public class MiddleThree{
	public static String middleThree(String str) {
		// ここに回答を記入
		int strMid = str.length()/2;
		return str.substring(strMid-1, strMid+2);
	}
}
