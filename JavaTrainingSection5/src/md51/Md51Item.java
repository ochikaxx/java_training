package md51;

public class Md51Item {

    /** 商品名 */
    private String name;
    
    /** 商品の金額 */
    private double price;
    
    /** 消費税 */
    private final double tax = 0.1;

    /**
     * getterメソッド
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setterメソッド
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getterメソッド
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * setterメソッド
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 購入金額計算メソッド
     * @return
     */
    public double pay() {
        return price + (price * tax);
    }
}