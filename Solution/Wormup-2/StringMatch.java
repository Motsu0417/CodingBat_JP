/*
【問題】
2つの文字列[a][b]が与えられます。
[a]と[b]の同じ位置に同じ文字が2文字の"合同部分"がある数を返してください。
a=["xxcaazz"]と、b=["xxbaaz"] の場合
["(xx)caazz"]["xxc(aa)zz"]["xxca(az)z"]
["(xx)baaz"] ["xxb(aa)z"] ["xxba(az)"]
["xx"]と["aa"]と["az"]が同じ位置同様の文字が2文字続いているので、3です。

【例】
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0

【コンパイル＆回答チェック方法】
> java Test StringMatch
*/

public class StringMatch{
	public static int stringMatch(String a, String b) {
		// ここに回答を記入
		int cnt = 0;
		for(int i = 0;i < a.length()-1 && i < b.length()-1;i++){
			if(a.charAt(i) == b.charAt(i) && a.charAt(i+1) == b.charAt(i+1)) cnt++;
		}
		return cnt;
	}
}
