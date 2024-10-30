package md62;

public class Md62 {
	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		Person[] people = {
				new Person("山田", 26, "東京都大田区大森", "090-0000-0000"),
				new Person("鈴木", 33, "和歌山県和歌山市", "090-1111-2222"),
				new Person("田中", 41, "宮城県仙台市", "090-3333-4444")
		};
		
		for (Person person : people) {
			person.info();
		}
	}
}