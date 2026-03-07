/*
【問題】
超しゃべるオウムを飼っています。
引数[hour]は0～23の範囲の現在時刻（時）を受け取ります。
引数[talking]はオウムがしゃべっているかどうかを受け取ります。
時刻が7時より前か、20時より後なら、問題が起きています。
問題が起きているなら[true]を返してください。

【例】
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false

【コンパイル＆回答チェック方法】
> java Test ParrotTrouble
*/

public class ParrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour) {
        // ここに回答を記入
        return talking && (hour < 7 || hour > 20); 
    }
}
