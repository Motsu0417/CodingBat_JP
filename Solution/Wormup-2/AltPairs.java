/*
【問題】
文字列[str]が与えられます。
文字列のインデックス[0,1],[4,5],[8,9]...[4n,4n+9]のインデックスの文字を取り出した新しい文字列を返してください。

【例】
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"

【コンパイル＆回答チェック方法】
> java Test AltPairs
*/

public class AltPairs{
	public static String altPairs(String str) {
		// ここに回答を記入
		String newStr = "";
		for(int i = 0; i < str.length();i+=4){
			newStr += "" + str.charAt(i) + (i+1 < str.length() ? str.charAt(i+1) : "");
		}
		return newStr;
	}
}
