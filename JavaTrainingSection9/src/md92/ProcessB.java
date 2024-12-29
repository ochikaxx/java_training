package md92;

/**
 * ProcessBクラスは以下の項目をチェックし、結果を出力します。
 * 名前が5~20文字以内かつ年齢が30~60歳であること
 */
public class ProcessB implements Process {
	public boolean check(String name, int age) {
		return name.length() >= 5 && name.length() <= 20 && age >= 30 && age <= 60;
	}
	public void run(String name, int age) {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}