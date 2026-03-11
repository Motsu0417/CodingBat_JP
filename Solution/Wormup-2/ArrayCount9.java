/*
【問題】
int配列中の[9]の数を数えてください

【例】
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3

【コンパイル＆回答チェック方法】
> java Test ArrayCount9
*/

public class ArrayCount9{
	public static int arrayCount9(int[] nums) {
		// ここに回答を記入
		int cnt = 0;
		for (int i : nums) if (i == 9) cnt++;
		return cnt;
	}
}
