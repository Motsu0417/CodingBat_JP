/*
【問題】
整数配列[nums]が与えられます。
配列中に[6,6]もしくは[6,7]となっている部分を数えて返してください。

【例】
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1

【コンパイル＆回答チェック方法】
> java Test Array667
*/

public class Array667{
	public static int array667(int[] nums) {
		// ここに回答を記入
		int cnt = 0;
		for(int i = 0;i < nums.length - 1;i++) if((nums[i] == 6 && nums[i+1] == 6) || (nums[i] == 6 && nums[i+1] == 7)) cnt++;
		return cnt;
	}
}
