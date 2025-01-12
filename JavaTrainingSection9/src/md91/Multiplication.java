package md91;

/**
 * Multiplicationクラスは入力された2つの値を乗算します。
 */
public class Multiplication implements CalculateBase {
	/**
	 * calculateメソッド
	 * 2つの値を掛け算して値を返します。
	 */
	public int calculate(int x,int y) {
		return x * y;
	}
}