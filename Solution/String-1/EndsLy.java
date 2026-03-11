/*
【問題】
与えられた文字列が["ly"]で終わる場合[true]を返してください。

【例】
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

【コンパイル＆回答チェック方法】
> java Test EndsLy
*/

public class EndsLy{
	public static boolean endsLy(String str) {
		// ここに回答を記入
		return str.endsWith("ly");
	}
}
