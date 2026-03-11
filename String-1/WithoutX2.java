/*
【問題】
文字列が与えられます。文字列の先頭2文字の["x"]を取り除いた新しい文字列を返してください。
対象外であればそのまま返してください

【例】
withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

【コンパイル＆回答チェック方法】
> java Test WithoutX2
*/

public class WithoutX2{
	public static String withoutX2(String str) {
		// ここに回答を記入
		String tail = (str.length() > 2) ? str.substring(2) : "";
		String first = str.startsWith("x") ? "" : (str.length() > 0 ? str.substring(0, 1) : "");
		String second = ((str.length() > 1) ? (str.substring(1).startsWith("x") ? "" : str.substring(1, 2)) : ""); 
		return first + second + tail;

		/// 正規表現でごり押しするとこうなるよ
		/// if(str.length() < 1) return str;
		/// if(str.length() < 2) str.replace("x", "");
		/// return str.replaceAll("^.x", "" + str.charAt(0)).replaceAll("^x", "");
	}
}
