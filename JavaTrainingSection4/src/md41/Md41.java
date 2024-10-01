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
				{"2000円", "0円", "0円", "3500円"}
		};
		int count = 0;
		for(int i = 0; i < 4; i++) {
			System.out.println("契約者名:" + guest[0][i] + "\t" + "保険料:" + guest[1][i]);
			if(guest[2][i] != ("0円")) {
				count++;
			}
		}
		System.out.println("遅延利息金が発生している人数は" + count + "です。");
	}
}