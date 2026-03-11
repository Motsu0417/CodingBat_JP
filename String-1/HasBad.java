/*
【問題】
文字列[str]が与えられます。
[str]の文字インデックス[0]か[1]番目から["bad"]が始まるなら[true]を返してください。
なお、[str]は0文字を含む任意の文字列長です。

【例】
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false

【コンパイル＆回答チェック方法】
> java Test HasBad
*/

public class HasBad{
	public static boolean hasBad(String str) {
		// ここに回答を記入
		return (str.length() > 2) && ( str.startsWith("bad") || str.substring(1).startsWith("bad")); 
	}
}
