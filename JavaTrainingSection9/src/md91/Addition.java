package md91;

/**
 * Additionクラスは入力された2つの値を加算します。
 */
public class Addition implements CalculateBase {
	/**
	 * calculateメソッド
	 * 2つの値を足し算して値を返します。
	 */
	public int calculate(int x, int y) {
		return x + y;
	}
}