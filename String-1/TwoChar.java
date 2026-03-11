/*
【問題】
文字列[str]と整数[index]が与えられます。文字列のインデックス番号[index]番目から2文字を切り出した新しい文字列を返してください。
また、[index]の値が正しくない（文字列幅を超えている等）の場合は先頭から2文字を返してください。
なお、文字列は2文字以上です。

【例】
twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"

【コンパイル＆回答チェック方法】
> java Test TwoChar
*/

public class TwoChar{
	public static String twoChar(String str, int index) {
		// ここに回答を記入
		return (index > str.length()-2 || index < 0) ? str.substring(0, 2) : str.substring(index, index + 2);
	}
}
