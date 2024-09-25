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
		String[] price = new String[3];
		String[] pay = new String[3];
		// 配列への代入
		for (int i = 0; i < goods.length; i++) {
			System.out.println("商品を入力してください。");
			String str1 = br.readLine();
			goods[i] = str1;
			System.out.println("単価を入力してください。");
			String str2 = br.readLine();
			price[i] = str2;
			System.out.println("支払金額を入力してください。");
			String str3 = br.readLine();
			pay[i] = str3;
		}
		// String配列をint配列に変換
		int[] price2 = new int[price.length];
		for (int j = 0; j < price.length; j++) {
			price2[j] = Integer.parseInt(price[j]);
		}
		int[] pay2 = new int[pay.length];
		for (int k = 0; k < pay.length; k++) {
			pay2[k] = Integer.parseInt(pay[k]);
		}
		// 商品、単価、支払い金額の表示
		for (int l = 0; l < goods.length; l++) {
			if (price2[l] == pay2[l]) {
				System.out.println(goods[l] + "\t" + price[l] + "円" + "\t" + "支払い過不足無し");
			}else if (price2[l] > pay2[l]) {
				System.out.println(goods[l] + "\t" + price[l] + "円" + "\t" + "支払い不足");
			}else {
				System.out.println(goods[l] + "\t" + price[l] + "円" + "\t" + "支払い超過");
			}
		}
		// 単価、支払い金額差額の計算
		int sum1 = 0;
		int sum2 = 0;
		for (int m = 0; m < price.length; m++) {
			sum1 += price2[m];
		}
		for (int n = 0; n < pay.length; n++) {
			sum2 += pay2[n];
		}
		System.out.println("全体の不足金：" + (sum1-sum2) + "円");
	}
}