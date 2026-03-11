/*
【問題】
文字列[str]が与えられ、文字列の先頭2文字を新しい文字列として返してください。
なお、文字列が2文字未満の場合は存在する文字列をそのまま返してください
例えば、["X"]なら["X"]、[""]なら[""]です。
メモ：[str.length()]を利用することで[str]の長さを取得できます。

【例】
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"

【コンパイル＆回答チェック方法】
> java Test FirstTwo
*/

public class FirstTwo{
	public static String firstTwo(String str) {
		// ここに回答を記入
		return str.length() < 2 ? str : str.substring(0,2);
	}
}
