package md52;

public class Md52Calculator {
	
	/**
	 * Calculateメソッド
	 * @param value1 1つ目の値
	 * @param value2 2つ目の値
	 * @param operator 演算子
	 * @return result
	 */
	public double Calculate(double value1, double value2, String operator) {
		double result = 0;
		switch (operator) {
			case "+":
				result = value1 + value2;
				break;
			case "-":
				result = value1 - value2;
				break;
			case "*":
				result = value1 * value2;
				break;
			case "/":
				result = value1 / value2;
				break;
			default:
				System.out.println("(+,-,*,/のいずれかの演算子を入力してください。)");
				break;
		}
		return result;
	}
}