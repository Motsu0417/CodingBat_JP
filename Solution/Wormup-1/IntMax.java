/*
【問題】
3つの数字が与えられます。一番大きい値を返してください。

【例】
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3

【コンパイル＆回答チェック方法】
> java Test IntMax
*/

public class IntMax{
    public static int intMax(int a, int b, int c) {
        // ここに回答を記入
        return Math.max(Math.max(a, b), c);
    }   
}
