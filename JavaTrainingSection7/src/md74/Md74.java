package md74;

import java.io.*;

/**
 * Test4クラスはカンマ(",")で区切られた文字列を改行して表示します。
 */
public class Md74 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException {
		System.out.println("カンマ区切りの文字列を入力してください。(例：リンゴ,ミカン,バナナ,ナシ)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		// カンマ(",")を改行("\n")に変換
		String str2 = str1.replace(",", "\n");
		System.out.println("改行した文字列を表示します。");
		System.out.println(str2);
	}
}