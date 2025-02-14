package md10;

import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Md10クラスは入力した名前と年齢を表示します。
 * 選択したモードごとのチェックを通過することで表示が可能となります。
 */
public class Md10 {
	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			// 処理モード入力
			System.out.println("処理モードを入力してください。(1or2)");
			System.out.println("1:モードA");
			System.out.println("2:モードB");
			String str1 = br.readLine();

			// 入力モードチェック
			int mode;
			try {
				mode = Integer.parseInt(str1);
				if (mode != 1 && mode != 2) {
					throw new IllegalArgumentException("エラー発生:無効なモードが選択されました。(1or2を選択し直してください。)");
				}
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("エラー発生:整数を入力してください。(1or2)");
			}

			// マッピング
			Map<Integer, Process> operation = new HashMap<>();
			operation.put(1, new ProcessA());
			operation.put(2, new ProcessB());

			System.out.println("正しいモードが選択されました。");

			// 選択されたクラスを取得
			Process process = operation.get(mode);

			// 名前と年齢の入力
			System.out.println("名前を入力してください。");
			String name = br.readLine();

			System.out.println("年齢を入力してください。");
			String str2 = br.readLine();
			
			// 年齢入力エラーチェック
			int age;
			try {
				age = Integer.parseInt(str2);
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("エラー発生:年齢は整数で入力してください。");
			}

			// 入力項目のチェックと出力
			try {
				process.check(name, age);
				process.run(name, age);
			} catch (CustomException e) {
				System.out.println("エラー発生:" + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("エラー発生:入力時に問題が発生しました。");
		}
	}
}