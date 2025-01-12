package md91;

/**
 * Subtractionクラスは入力された2つの値を減算します。
 */
public class Subtraction implements CalculateBase {
	/**
	 * calculateメソッド
	 * 2つの値を引き算して値を返します。
	 */
	public int calculate(int x, int y) {
		return x - y;
	}
}