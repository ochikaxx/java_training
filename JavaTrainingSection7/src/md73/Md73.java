package md73;

import java.io.*;

/**
 * Md73クラスはユーザーが入力した数値を小数点第一位で四捨五入します。
 */
public class Md73 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException {
		System.out.println("小数点を含む数値を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		double num = Double.parseDouble(str);
		
		System.out.println("入力した数値は" + num + "です。");
		
		// 小数点以下を四捨五入
		double value = Math.round(num);
		
		// 結果をint型で表示します。
		System.out.println("四捨五入した数値は" + (int)value + "です。");
	}
}