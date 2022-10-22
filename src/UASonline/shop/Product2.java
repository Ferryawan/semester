package UASonline.shop;

public class Product2 extends Product{
    private int stock;
    private double price;
    private String name;

    public Product2(String name, int stock, double price) {
        super(name, stock, price);
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
