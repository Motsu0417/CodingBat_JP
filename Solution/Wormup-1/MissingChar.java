/*
【問題】
空でない文字列[str]と、整数[n]が与えられます。
インデックスの[n]番目の文字を削除した新しい文字列を返してください。

【例】
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"

【コンパイル＆回答チェック方法】
> java Test MissingChar
*/

public class MissingChar {
    public static String missingChar(String str, int n) {
        // ここに回答を記入
        return str.substring(0, n) + str.substring(n+1);
    }
}
