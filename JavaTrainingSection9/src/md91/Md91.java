package md91;

import java.util.Scanner;

/**
 * Md91クラスは選択した四則演算を行います。
 * 演算する数値はユーザーが入力した2つの整数です。
 */
public class Md91 {
	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Scannerクラスのインスタンス作成
		Scanner sc = new Scanner(System.in);
		
		// 演算項目選択メッセージ
		System.out.println("演算する項目を選択してください。(1-4)");
		System.out.println("1:足し算");
		System.out.println("2:引き算");
		System.out.println("3:掛け算");
		System.out.println("4:割り算");
		int num = sc.nextInt();
		
		// インターフェイス型変数宣言
		CalculateBase calculator;
		
		// 選択されたクラスをインスタンス化
		switch (num) {
			case 1:
				calculator = new Addition();
				break;
			case 2:
				calculator = new Subtraction();
				break;
			case 3:
				calculator = new Multiplication();
				break;
			case 4:
				calculator = new Division();
				break;
			default:
				System.out.println("正しい項目を入力してください。");
				sc.close();
				return;
		}
		
		// 演算する整数を入力
		System.out.println("1つ目の数値を入力してください。");
		int x = sc.nextInt();
		System.out.println("2つ目の数値を入力してください。");
		int y = sc.nextInt();

		// 結果を表示
		int result = calculator.calculate(x, y);
		System.out.println("計算結果:" + result);
		
		sc.close();
	}
}