package md72;

import java.io.*;

/**
 * Md72クラスはユーザーが入力した文字列から空白を削除します。
 */
public class Md72 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException {
		System.out.println("空白を含めた文字を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println("入力された文字は「" + str + "」です。");
		// 半角スペースを空文字に置換
		str = str.replaceAll(" ", "");
		// 全角スペースを空文字に置換
		str = str.replaceAll("　", "");
		System.out.println("空白を省いた文字は「" + str + "」です。");
	}
}