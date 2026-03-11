/*
【問題】
文字列が与えられます。文字列の最後の2文字を"末端部分"として、文字列中に"末端部分"が何度現れるか数えて返してください。
なお、末尾の"末端部分"そのものは数えないものとします。

【例】
last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2

【コンパイル＆回答チェック方法】
> java Test Last2
*/

public class Last2{
	public static int last2(String str) {
		// ここに回答を記入
		int cnt = 0;
		for(int i = 0; i < str.length()-2;i++){
			if(str.substring(i).startsWith(str.substring(str.length()-2))) cnt++;
		}
		return cnt;
	}
}
