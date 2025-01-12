package md92;

/**
 * ProcessAクラスは以下の項目をチェックし、結果を出力します。
 * 名前が10文字未満かつ年齢が0~140歳であること
 */
public class ProcessA implements Process {
	/**
	 * checkメソッド
	 * nameとageの値が条件に合っていたらtureを返します。
	 */
	public boolean check(String name, int age) {
		return name.length() < 10 && age >= 0 && age <= 140;
	}
	/**
	 * runメソッド
	 * 入力された項目を表示します。
	 */
	public void run(String name, int age) {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}
}