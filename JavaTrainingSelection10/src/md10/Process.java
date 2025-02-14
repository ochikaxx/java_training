package md10;

/**
 * Processインターフェイスは入力項目のチェック、表示するための抽象メソッドを定義します。
 */
interface Process {
	/**
	 * checkメソッド
	 * @param name
	 * @param age
	 */
	void check(String name, int age) throws CustomException;
	/**
	 * runメソッド
	 * @param name
	 * @param age
	 */
	void run(String name, int age);
}