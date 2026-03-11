/*
【問題】


【例】
conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"

【コンパイル＆回答チェック方法】
> java Test ConCat
*/

public class ConCat{
	public static String conCat(String a, String b) {
		// ここに回答を記入
		if(a.length() == 0 || b.length() == 0) return a + b;
		return a + ((a.charAt(a.length()-1) != b.charAt(0)) ? b : b.substring(1));
	}
}
