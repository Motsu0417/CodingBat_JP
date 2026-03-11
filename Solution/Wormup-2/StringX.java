/*
【問題】
文字列[str]が与えられ、文字列から['x']を取り除いた文字列を返してください。
なお、文頭と文末の['x']は取り除かないでください。

【例】
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"

【コンパイル＆回答チェック方法】
> java Test StringX
*/

public class StringX{
	public static String stringX(String str) {
		// ここに回答を記入
		return str.length() < 2 ? str : str.charAt(0) + str.substring(1,str.length()-1).replaceAll("x", "") + str.charAt(str.length()-1);
	}
}
