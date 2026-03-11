/*
【問題】
与えられた文字列の先頭か末尾に["x"]が存在する場合、["x"]を取り除いた文字列を返してください。
そうでなければ元の文字列を返してください。

【例】
withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

【コンパイル＆回答チェック方法】
> java Test WithoutX
*/

public class WithoutX{
	public static String withoutX(String str) {
		// ここに回答を記入
		String removeFrontX = (str.startsWith("x") ? str.substring(1) : str);
		return removeFrontX.endsWith("x") ? removeFrontX.substring(0, removeFrontX.length()-1) : removeFrontX;
	}
}
