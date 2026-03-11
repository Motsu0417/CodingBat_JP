/*
【問題】
文字列[str]が与えられ、[str]中に["xx"]が何度現れるか数えて返してください。
["xxx"]の場合、"(xx)x"と"x(xx)"で2つとカウントします。

【例】
countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3

【コンパイル＆回答チェック方法】
> java Test CountXXs
*/

public class CountXX{
	public static int countXX(String str) {
		// ここに回答を記入
		int cnt = 0;
		for(int i = 0; i < str.length()-1;i++){
			if(str.substring(i).startsWith("xx")) cnt++;
		}
		return cnt;
	}
}
