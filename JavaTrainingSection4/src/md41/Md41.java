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
		String[] guest = {"中村", "田島", "小澤", "大西"};
		int[][] fee = {
				{5000, 3000, 4500, 6000},
				{2000, 0, 0, 3500}
		};
		int count = 0;
		for(int i = 0; i < 4; i++) {
			System.out.println("契約者名:" + guest[i] + "\t" + "保険料:" + fee[0][i] + "円");
			if(fee[1][i] > 0) {
				count++;
			}
		}
		System.out.println("遅延利息金が発生している人数は" + count + "です。");
	}
}