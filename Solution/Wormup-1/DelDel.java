/*
【問題】
文字列[str]が与えられます。
[str]のインデックス[1]（2文字目）が["del"]から始まる場合、その["del"]を削除した文字列を返してください。
その他の場合は元の文字列を返してください。

【例】
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"

【コンパイル＆回答チェック方法】
> java Test DelDel
*/

public class DelDel{
    public static String delDel(String str) {
        // ここに回答を記入
        if(str.length() < 1) return str; 
        return str.substring(1).startsWith("del") ? str.replace("del", "") : str;
    }   
}
