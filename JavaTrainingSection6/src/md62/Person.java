package md62;

public class Person {
	/** 氏名 */
	private String name;
	/** 年齢 */
	private int age;
	/** 住所 */
	private String address;
	/** 電話番号 */
	private String phone;
	
	/**
	 * Person コンストラクタ
	 * @param name
	 * @param age
	 * @param address
	 * @param phone
	 */
	public Person(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	/**
	 * getterメソッド
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * setterメソッド
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getterメソッド
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * setterメソッド
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * setterメソッド
	 * @param age
	 */
	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}
	
	/**
	 * getterメソッド
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * setterメソッド
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * getterメソッド
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * setterメソッド
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * インスタンス変数の値を出力
	 */
	public void info() {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "歳です。住所は" + address + "です。電話番号は" + phone + "です。");
		System.out.println("\n");
	}
}