package md31_case1;

import java.io.*;

/**
 * 実力確認問題3-1.mdケース1
 */
class Md31_case1 {
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
		
		if (res >= 60) {
			System.out.println("合格");
		}
		else if (res <= 59) {
			System.out.println("不合格");
		}
		else {
			System.out.println("整数を入力してください。");
		}
	}
}