package md91;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

/**
 * Md91クラスは選択した四則演算を行います。
 * 演算する数値はユーザーが入力した2つの整数です。
 */
public class Md91 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 演算項目選択メッセージ
		System.out.println("演算する項目を選択してください。(1-4)");
		System.out.println("1:足し算");
		System.out.println("2:引き算");
		System.out.println("3:掛け算");
		System.out.println("4:割り算");
		String str1 = br.readLine();
		int mode = Integer.parseInt(str1);
		
		// マッピング
		Map<Integer, CalculateBase> operation = new HashMap<>();
		operation.put(1, new Addition());
		operation.put(2, new Subtraction());
		operation.put(3, new Multiplication());
		operation.put(4, new Division());
		
		// 入力項目が存在するキーであるか確認
		if (operation.containsKey(mode)) {
			System.out.println("計算を開始します。");
		} else {
			System.out.println("(1-4)の項目を選択してください。");
			return;
		}
		
		// 選択された演算クラスを取得
		CalculateBase calculator = operation.get(mode);
		
		// 演算する整数を入力
		System.out.println("1つ目の数値を入力してください。");
		String str2 = br.readLine();
		int x = Integer.parseInt(str2);
		System.out.println("2つ目の数値を入力してください。");
		String str3 = br.readLine();
		int y = Integer.parseInt(str3);

		// 結果を表示
		int result = calculator.calculate(x, y);
		System.out.println("計算結果:" + result);
	}
}