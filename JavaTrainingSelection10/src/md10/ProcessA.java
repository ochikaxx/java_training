package md10;

/**
 * ProcessAクラスは以下の項目をチェックし、結果を出力します。
 * 名前が10文字未満かつ年齢が0~140歳であること
 */
public class ProcessA implements Process {
	/**
	 * checkメソッド
	 * nameとageの値が条件に合わなければCustomExceptionをthrowします
	 * @param name
	 * @param age
	 */
	public void check(String name, int age) throws CustomException {
		if (name.length() >= 10 || age < 0 || age > 140) {
			throw new CustomException("名前が10文字未満かつ0~140歳である必要があります。");
		}
	}
	/**
	 * runメソッド
	 * 入力された項目を表示します。
	 * @param name
	 * @param age
	 */
	public void run(String name, int age) {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}
}