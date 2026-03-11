/*
【問題】
文字列[str]が与えられます。最初の2文字を除いた文字列を返してください。
なお、[str]は0文字を含む任意の文字列長です。
また、以下の条件に従ってください
・最初の文字が["a"]の場合は先頭の["a"]は除かないでください。
・2文字目が["b"]の場合は2文字目の["b"]は除かないでください。
※見かけより難しい問題です

【例】
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"

【コンパイル＆回答チェック方法】
> java Test DeFront
*/

public class DeFront{
	public static String deFront(String str) {
		// ここに回答を記入
		String tail = str.length() > 2 ? str.substring(2) : "";
		return (str.startsWith("a") ? "a" : "") + (str.length() > 1 && str.charAt(1) == 'b' ? "b" : "") + tail; 
	}
}
