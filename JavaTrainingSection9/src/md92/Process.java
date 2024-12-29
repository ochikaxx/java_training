package md92;

/**
 * Processインターフェイスは入力項目のチェック、表示するための抽象メソッドを定義します。
 */
interface Process {
	boolean check(String name, int age);
	void run(String name, int age);
}