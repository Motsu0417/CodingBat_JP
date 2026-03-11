/*
【問題】
2つの整数が与えられます。
そのうち10～20の範囲内(両端入れ)にある数字を対象とし、
対象のより大きい数字を返してください。
なお、どちらも対象外の場合は0を返してください。

【例】
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11

【コンパイル＆回答チェック方法】
> java Test Max1020
*/

public class Max1020{
    public static int max1020(int a, int b) {
        // ここに回答を記入
        int max = Math.max(a, b);
        if(10 <= max && max <= 20) return max;
        if(10 <= a && a <= 20) return a;
        if(10 <= b && b <= 20) return b;
        return 0;
    }   
}
