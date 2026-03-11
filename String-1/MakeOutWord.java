/*
【問題】
["<<>>"]や["{{}}"]の様な長さ4の"出力"文字列[out]と、文字列[word]が与えられます。
[out]文字列の中央に[word]を挿入した["<<word>>"]や["{{word}}"]の様な文字列を返してください。
メモ：[str.substring(i, j)]を利用することで[i]番から[j]番の文字列が抽出できます。

【例】
makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"

【コンパイル＆回答チェック方法】
> java Test MakeOutWord
*/

public class MakeOutWord{
	public static String makeOutWord(String out, String word) {
		// ここに回答を記入
		return out.substring(0,2) + word + out.substring(2);
	}
}
