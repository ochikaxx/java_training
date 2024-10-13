package md52;

public class Md52Calculator {
	
	/** 1つ目の数値 */
	private double value1;
	
	/** 2つ目の数値 */
	private double value2;
	
	/** 演算子 */
	private String operator;
	
	/**
	 * getterメソッド
	 * @return value1
	 */
	public double getValue1() {
		return value1;
	}
	
	/**
	 * setterメソッド
	 * @param value1
	 */
	public void setValue1(double value1) {
		this.value1 = value1;
	}
	
	/**
	 * getterメソッド
	 * @return value2
	 */
	public double getValue2() {
		return value2;
	}
	
	/**
	 * setterメソッド
	 * @param value2
	 */
	public void setValue2(double value2) {
		this.value2 = value2;
	}
	
	/**
	 * getterメソッド
	 * @return operator
	 */
	public String getOperator() {
		return operator;
	}
	
	/**
	 * setterメソッド
	 * @param operator
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	/**
	 * Calculateメソッド
	 * @return result
	 */
	public double Calculate() {
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