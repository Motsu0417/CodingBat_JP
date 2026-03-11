/*
【問題】
文字列が与えられます。文字列中最初に現れる["x"]の直後にも["x"]が続く場合[true]を返してください。

【例】
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

【コンパイル＆回答チェック方法】
> java Test DoubleX
*/

public class DoubleX{
	public static boolean doubleX(String str) {
		// ここに回答を記入
		int firstXindex = 0;
		for(int i = 0;i < str.length()-1;i++){
			if(str.charAt(i) == 'x') {
				firstXindex = i;
				break;
			}
		}
		return str.length() > 1 && str.charAt(firstXindex+1) == 'x';
	}
}
