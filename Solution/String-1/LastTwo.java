/*
【問題】
0文字を含む任意長の文字列[str]が与えられます。
末尾2文字が存在する場合、末尾2文字をを入れ替えた文字列を返してください。

【例】
lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"

【コンパイル＆回答チェック方法】
> java Test LastTwo
*/

public class LastTwo{
	public static String lastTwo(String str) {
		// ここに回答を記入
		if(str.length() < 2) return str;
		return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
	}
}
