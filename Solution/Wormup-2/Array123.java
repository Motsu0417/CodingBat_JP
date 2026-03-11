/*
【問題】
整数配列[nums]が与えられます。
配列のどこかに[1,2,3]の並びが現れる場合[true]を返してください。

【例】
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true

【コンパイル＆回答チェック方法】
> java Test Array123
*/

public class Array123{
	public static boolean array123(int[] nums) {
		// ここに回答を記入
		for(int i = 0; i < nums.length - 2;i++) if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
		return false;
	}
}
