package md52;

import java.io.*;

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
		
		Md52Calculator calculator = new Md52Calculator();
		
		double result = calculator.Calculate(value1, value2, operator);
		
		System.out.println("計算結果" + "\t" + result);
	}
}