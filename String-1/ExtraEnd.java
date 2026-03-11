/*
【問題】
文字列が与えられます。最後の2文字を3回繰り返した新しい文字列を返してください。
なお、与えられる文字列は2文字以上です。

【例】
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"

【コンパイル＆回答チェック方法】
> java Test ExtraEnd
*/

public class ExtraEnd{
	public static String extraEnd(String str) {
		// ここに回答を記入
		return str.substring(str.length()-2).repeat(3);
		/// Java SE 11 以下ではrepeatは利用できないので、上記がコンパイルエラーになる場合は以下の書き方を利用できます。
		/// String tmp = str.substring(str.length()-2)
		/// return tmp + tmp + tmp;
	}
}
