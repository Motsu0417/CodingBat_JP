/*
【問題】
整数配列が与えられます。
配列中に3つ同じ数字が並んでいる部分を"トリプル"と呼ぶこととします。
配列中に"トリプル"が含まれないなら[true]を返し、含まれる場合には[false]を返してください。

【例】
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false

【コンパイル＆回答チェック方法】
> java Test NoTriples
*/

public class NoTriples{
	public static boolean noTriples(int[] nums) {
		// ここに回答を記入
		for(int i = 0;i < nums.length -2;i++) if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) return false;
		return true;
	}
}
