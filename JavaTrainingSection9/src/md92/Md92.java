package md92;

import java.io.*;

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
		
		// インターフェイス型変数宣言
		Process process;
		
		// 入力モードに対応したクラスをインスタンス化
		switch (mode) {
			case 1:
				process = new ProcessA();
				break;
			case 2:
				process = new ProcessB();
				break;
			default:
				System.out.println("正しいモードを入力してください。");
				return;
		}
		
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