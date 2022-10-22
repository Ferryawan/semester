package UASonline.shop;

public class ShoppingCart {
    // inisialisasi atribut
    private Product listProduct[];
    private int productCount;

    // konstruktor
    public ShoppingCart() {
        listProduct = new Product[25];
        productCount = 0;
    }

    public void addToCartProcess(Product product) {
        this.listProduct[productCount] = product;
        this.productCount++;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            total += listProduct[i].getPrice();
        }
        System.out.println("\nTotal price: " + total);
        return 0;
    }

    public void displayAllProduct() {
        for (int i = 0; i < productCount; i++) {
            System.out.println(
                    "Product " + (i + 1) + ": " + listProduct[i].getName() + " - " + listProduct[i].getPrice());
            System.out.println("total: " + listProduct[i].getPrice());
        }

        System.out.println("The amount of goods: " + productCount);
        System.out.println("---------------------------------------------------------------------------");
    }

    public int getProductCount() {
        return productCount;
    }

    public void resetShoppingCart() {
        listProduct = new Product[25];
        productCount = 0;
    }
}
