/*
【問題】
引数[n]が与えられます。[n]と[21]の絶対差（+-差分の絶対値）を返してください。
なお、[n]が[21]より大きい場合は、その絶対差の2倍の値を返してください。

【例】
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

【コンパイル＆回答チェック方法】
> java Test Diff21
*/

public class Diff21 {
    public static int diff21(int n) {
        // ここに回答を記入
        return (n > 21  ? 2 : 1) * Math.abs(n-21);
    }

}
