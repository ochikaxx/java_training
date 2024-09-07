package md32;

import java.io.*;

/**
 * 実力確認問題3-2.md
 */
class Md32 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("整数xを入力してください。");
		String str1 = br.readLine();
		int x = Integer.parseInt(str1);
		
		System.out.println("整数yを入力してください。");
		String str2 = br.readLine();
		int y = Integer.parseInt(str2);
		
		if (x < y && x %2 == 0 && y %2 ==0) {
			System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
		}
		else if (x == y && x < 0 && y < 0) {
			System.out.println("xとyは等しく、かつ、負の数である。");
		}
		else if (x < y || x %2 ==0) {
			System.out.println("xはyより小さい、または、xは偶数である。");
		}
		else {
			System.out.println("条件に当てはまっていない。");
		}
	}
}