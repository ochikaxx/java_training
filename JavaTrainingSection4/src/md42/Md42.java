package md42;

import java.io.*;
/**
 * 実力確認問題4-2.md
 */
public class Md42 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 配列宣言
		String[] goods = new String[3];
		int[] price = new int[3];
		int[] pay = new int[3];
		// 配列への代入
		for (int i = 0; i < goods.length; i++) {
			System.out.println("商品を入力してください。");
			String str1 = br.readLine();
			goods[i] = str1;
			System.out.println("単価を入力してください。");
			String str2 = br.readLine();
			price[i] = Integer.parseInt(str2);
			System.out.println("支払金額を入力してください。");
			String str3 = br.readLine();
			pay[i] = Integer.parseInt(str3);
		}
		// 商品、単価、支払い金額の表示
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < goods.length; i++) {
			if (price[i] == pay[i]) {
				System.out.println(goods[i] + "\t" + price[i] + "円" + "\t" + "支払い過不足無し");
			} else if (price[i] > pay[i]) {
				System.out.println(goods[i] + "\t" + price[i] + "円" + "\t" + "支払い不足");
			} else {
				System.out.println(goods[i] + "\t" + price[i] + "円" + "\t" + "支払い超過");
			}
			sum1 += price[i];
			sum2 += pay[i];
		}
		System.out.println("全体の不足金:" + (sum1 - sum2) + "円");
	}
}