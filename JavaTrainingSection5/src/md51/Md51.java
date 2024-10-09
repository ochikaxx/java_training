package md51;

import java.io.*;

class Item {
	/**
	 * showItemメソッド
	 */
	String name;
	double price;
	double tax = 0.1;
	
	void showItem(String name, int price) {
		System.out.println("商品名" + "\t" + name);
		System.out.println("金額" + "\t" + price + "円");
		System.out.println("購入金額" + "\t" + (int)(price + (price * tax)) + "円");
	}
}

public class Md51 {
	/**
	 * mainメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("商品名を入力してください。");
		String name = br.readLine();
		
		System.out.println("金額を入力してください。");
		String str = br.readLine();
		int price = Integer.parseInt(str);
		
		Item item = new Item();
		item.showItem(name, price);
	}
}