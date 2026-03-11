/*
【問題】
文字列[str]が与えられ、[str]に['e']が1～3個含まれていれば[true]を返してください。

【例】
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false

【コンパイル＆回答チェック方法】
> java Test StringE
*/

public class StringE{
    public static boolean stringE(String str) {
        // ここに回答を記入
        int countE = str.replaceAll("[^e]", "").length();
        return 1 <= countE && countE <= 3;
    }   
}
