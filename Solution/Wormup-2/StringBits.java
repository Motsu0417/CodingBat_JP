/*
【問題】
文字列が与えられます。先頭から1文字おきに取り出して作成した文字列を返してください。

【例】
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"

【コンパイル＆回答チェック方法】
> java Test StringBits
*/

public class StringBits{
	public static String stringBits(String str) {
		// ここに回答を記入
		String newStr = "";
		for(int i = 0;i < str.length();i+=2){
			newStr += str.charAt(i);
		}
		return newStr;
	}
}
