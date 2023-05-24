class productt {
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    // ! Constructors___________________
    public productt() {
        itemNo = "0000";
        name = "No Name";
        price = 0.0;
        qty = 0;
    }

    public productt(String itemNo) {
        this.itemNo = itemNo;
    }

    public productt(String itemNo, String name) {
        this.itemNo = itemNo;
        this.name = name;
    }

    public productt(String itemNo, String name, double price) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
    }

    public productt(String itemNo, String name, double price, short qty) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // !methods_________________________
    public String getItemNo() {
        return itemNo;
    }

    public String getnName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQty() {
        return qty;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(short qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Item No. is " + itemNo + "\n" + "Name of product is " + name + "\n" + "Price of product is " + price
                + "\n"
                + "Quantity of product is " + qty;
    }

}

// ! main class in product class---------
public class product {
    public static void main(String[] args) {
        productt p1 = new productt("A-101");
        short a = 5;
        p1.setName("Laptop");
        p1.setPrice(50000.0);
        p1.setQty(a);
        System.out.println(p1);
        System.out.println(p1.toString());

    }
}
