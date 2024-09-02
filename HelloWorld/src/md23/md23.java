package md23;

/**
 * 実力確認問題2-3.mdメインクラス
 */
class md23 {
	/**
	 * mainメソッド
	 * @param args 実行引数
	 */
	public static void main(String args[]) {
		int x = 5;
		int y = 10;
		System.out.println("変数xの初期値は" + x + "です。");
		System.out.println("変数yの初期値は" + y + "です。");
		
		// xとyの値入れ替え
		int z = y;
		y = x;
		x = z;
		System.out.println("入れ替え後のxの値は" + x + "です。");
		System.out.println("入れ替え後のyの値は" + y + "です。");
	}
}