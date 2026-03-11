/*
【問題】
整数配列[num]が与えられます。
ある数[x]に対し、[x,x+5,x-1]という数列を"271パターン"と呼ぶこととします。
配列中に"271パターン"が含まれるなら[true]を返してください。
ただし、"271パターン"の[x-1]の部分に関しては緩く、[x-1]±2つまり[x-3]～[x+1]までの範囲を許可します。

【例】
has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true

【コンパイル＆回答チェック方法】
> java Test Has271
*/

public class Has271{
	public static boolean has271(int[] nums) {
		// ここに回答を記入
		for(int i = 0;i < nums.length-2;i++){
			int x = nums[i];
			if((nums[i+1] == x+5) && (nums[i+2] >= x-3 && nums[i+2] <= x+1)) return true;
		}
		return false;
	}
}
