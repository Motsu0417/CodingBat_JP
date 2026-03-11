/*
【問題】
文字列[str]が与えられます。[str]の先頭2文字を末尾に移動させた、2回左ローテーション文字列を作成し返してください。

【例】
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"

【コンパイル＆回答チェック方法】
> java Test Left2
*/

public class Left2{
	public static String left2(String str) {
		// ここに回答を記入
		return str.substring(2) + str.substring(0,2);
	}
}
