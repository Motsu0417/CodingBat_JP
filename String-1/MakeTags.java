/*
【問題】
Webページは、["<i>こんにちは</i>"] のようなHTMLで作られています。この場合、["こんにちは"]は斜体で描画されます。
この例では、"iタグ"は["こんにちは"]を囲む["<i>"]と["</i>"]を生成しています。
文字列[tag]と[word]が与えられます。[word]を[tag]で囲んだHTMLを作成して返してください。

【例】
makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"

【コンパイル＆回答チェック方法】
> java Test MakeTags
*/

public class MakeTags{
	public static String makeTags(String tag, String word) {
		// ここに回答を記入
		return String.format("<%s>%s</%s>", tag, word, tag);
	}
}
