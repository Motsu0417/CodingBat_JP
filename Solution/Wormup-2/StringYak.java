/*
【問題】
文字列[str]が与えられます。
["yak"]は不要な文字列とします。[str]から["yak"]を取り除いた新しい文字列を返してください。
なお、["yak"]のうち、["a"]はどんな文字でもよく、["yok"]["ynk"]["y1k"]なども該当します。

【例】
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"

【コンパイル＆回答チェック方法】
> java Test StringYak
*/

public class StringYak{
	public static String stringYak(String str) {
		// ここに回答を記入
		return str.replaceAll("y[a-z|A-Z|0-9]k", "");
	}
}
