package md51;

import java.io.*;

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
        double price = Double.parseDouble(str);

        Md51Item item = new Md51Item();
        item.setName(name);
        item.setPrice(price);

        System.out.println("商品名" + "\t" + item.getName());
        System.out.println("金額" + "\t" + (int)item.getPrice() + "円");
        System.out.println("購入金額" + "\t" + (int)item.pay() + "円");
    }
}
