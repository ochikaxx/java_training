package md31_case2;

import java.io.*;

/**
 * 実力確認問題3-1.mdケース2
 */
public class Md31case2 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("点数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if (res >= 80 && res <= 100) {
			System.out.println("たいへんよくできました。");
		} else if (res >= 60 && res <= 79) {
			System.out.println("よくできました。");
		} else if (res <= 59 && res >= 0) {
			System.out.println("ざんねんでした。");
		} else {
			System.out.println("0~100の整数を入力してください。");
		}
	}
}