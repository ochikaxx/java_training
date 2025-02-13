package md10;

/**
 * ProcessBクラスは以下の項目をチェックし、結果を出力します。
 * 名前が5~20文字以内かつ年齢が30~60歳であること
 */
public class ProcessB implements Process {
	/**
	 * checkメソッド
	 * nameとageの値が条件に合っていたらtureを返します。
	 * @param name
	 * @param age
	 * @return 真ならばtrue偽ならばfalse
	 */
	public boolean check(String name, int age) throws CustomException {
		if (name.length() >= 5 && name.length() <= 20 && age >= 30 && age <= 60) {
			return true;
		} else {
			throw new CustomException("名前が5~20文字以内かつ年齢が30~60歳である必要があります。");
		}
	}
	/**
	 * runメソッド
	 * 入力された項目を表示します。
	 */
	public void run(String name, int age) {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}