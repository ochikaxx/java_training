package md31_case3;

import java.io.*;

/**
 * 実力確認問題3-1.mdケース3
 */
class Md31_case3 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		System.out.println("点数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if (res >= 80) {
			System.out.println("優");
		}
		else if (res >= 70 && res <= 79) {
			System.out.println("良");
		}
		else if (res >= 60 && res <= 69) {
			System.out.println("可");
		}
		else if (res <= 59) {
			System.out.println("不可");
		}
		else {
			System.out.println("整数を入力してください。");
		}
	}
}