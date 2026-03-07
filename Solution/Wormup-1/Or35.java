/*
【問題】
自然数[n]が与えられます。
[n]が3の倍数もしくは5の倍数なら[true]を返してください。
ヒント：剰余演算子[%]を利用します。

【例】
or35(3) → true
or35(10) → true
or35(8) → false

【コンパイル＆回答チェック方法】
> java Test Or35
*/

public class Or35 {
    public static boolean or35(int n) {
        // ここに回答を記入
        return (n % 3 == 0) || (n % 5 == 0);
    }
}
