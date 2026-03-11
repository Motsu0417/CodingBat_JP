/*
【問題】
0文字を含む任意の文字列長の文字列[str]が与えられます。
文字列の先頭2文字を"先頭部分"とし、先頭部分を3回繰り返した新しい文字列を返してください。
なお、文字列が2文字未満の場合は存在する部分を"先頭部分"とします。

【例】
extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"

【コンパイル＆回答チェック方法】
> java Test ExtraFront
*/

public class ExtraFront{
	public static String extraFront(String str) {
		// ここに回答を記入
		String front = str.length() < 2 ? str : str.substring(0, 2);
		return front.repeat(3);
		/// Java SE 11 以下の場合はString.repeat(int)がないので、以下の通り実装できます
		/// return front + front + front;
	}
}
