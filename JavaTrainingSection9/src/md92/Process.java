package md92;

/**
 * Processインターフェイスは入力項目のチェック、表示するための抽象メソッドを定義します。
 */
interface Process {
	/**
	 * checkメソッド
	 * @param name
	 * @param age
	 * @return
	 */
	boolean check(String name, int age);
	/**
	 * runメソッド
	 * @param name
	 * @param age
	 */
	void run(String name, int age);
}