package md41;
/**
 * 実力確認問題4-1.md
 */
public class Md41 {
	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] guest = {
				{"中村", "田島", "小澤", "大西"},
				{"5000円", "3000円", "4500円", "6000円"},
				{"2000円", "3500円"}
		};
		for(int i = 0; i < 4; i++) {
			System.out.println("契約者名:" + guest[0][i] + "\t" + "保険料:" + guest[1][i]);
		}
		System.out.println("遅延利息金が発生している人数は" + guest[2].length + "です。");
	}
}