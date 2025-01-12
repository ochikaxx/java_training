package md92;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

/**
 * Md92クラスは入力した名前と年齢を表示します。
 * 選択したモードごとのチェックを通過することで表示が可能となります。
 */
public class Md92 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 処理モード入力
		System.out.println("処理モードを入力してください。(1or2)");
		System.out.println("1:モードA");
		System.out.println("2:モードB");
		String str1 = br.readLine();
		int mode = Integer.parseInt(str1);
		
		// マッピング
		Map<Integer, Process> operation = new HashMap<>();
		operation.put(1, new ProcessA());
		operation.put(2, new ProcessB());
		
		// 入力されたモードの確認
		if (operation.containsKey(mode)) {
			System.out.println("正しいモードが選択されました。");
		} else {
			System.out.println("(1-2)のモードを入力してください。");
			return;
		}
		
		// 選択されたクラスを取得
		Process process = operation.get(mode);
		
		// 名前と年齢の入力
		System.out.println("名前を入力してください。");
		String name = br.readLine();
		System.out.println("年齢を入力してください。");
		String str2 = br.readLine();
		int age = Integer.parseInt(str2);
		
		// 入力項目のチェックと出力
		if (process.check(name, age)) {
			process.run(name, age);
		} else {
			System.out.println("入力された名前と年齢に間違いがあります。");
		}
	}
}