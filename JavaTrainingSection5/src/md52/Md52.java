package md52;

import java.io.*;

class Calculator {
	/**
	 * passCalculatorメソッド
	 * Calculateメソッド
	 */
	double value1;
	double value2;
	String operator;
	
	void passCalculator(double value1, double value2, String operator) {
		this.value1 = value1;
		this.value2 = value2;
		this.operator = operator;
	}
	
	double Calculate() {
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

public class Md52 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1つ目の数値を入力してください。");
		String str1 = br.readLine();
		double value1 = Double.parseDouble(str1);
		
		System.out.println("2つ目の数値を入力してください。");
		String str2 = br.readLine();
		double value2 = Double.parseDouble(str2);
		
		System.out.println("演算子を入力してください。");
		String operator = br.readLine();
		
		Calculator calculator = new Calculator();
		calculator.passCalculator(value1, value2, operator);
		
		double result = calculator.Calculate();
		
		System.out.println("計算結果" + "\t" + result);
	}
}