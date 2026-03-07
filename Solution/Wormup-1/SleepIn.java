/*
【問題】
引数[weekday]は平日なら[true]、引数[vacation]は休暇中なら[true]です。
平日ではない、もしくは休暇中であれば寝て過ごすことができます。
寝入ることができるなら[true]を返してください。

【例】
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true

【コンパイル＆回答チェック方法】
> java Test SleepIn
*/
public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // 回答を入力
        return !weekday || vacation;
    }
}

