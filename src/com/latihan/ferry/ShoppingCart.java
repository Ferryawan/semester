package com.latihan.ferry;

public class ShoppingCart {
    private Product listProduk[];   //agregasi
    private int productCount;

    public ShoppingCart() {
        listProduk = new Product[25];
        productCount = 0;
    }

    public void addToCartProcess(Product product) {
        listProduk[productCount] = product;
        productCount++;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            total = total + listProduk[i].getPrice();
        }
        return total;
    }

    public void displayAllProduct() {
        for (int i = 0; i < productCount; i++) {
            System.out.println("Nama : " + listProduk[i].getName());
            System.out.println("Harga : " + listProduk[i].getPrice());
            System.out.println("Stok : " + listProduk[i].getStock());
        }
    }

    public int getProductCount() {
        return productCount;
    }

    public void resetShoppingCart() {
        listProduk = new Product[25];
        productCount = 0;
    }
}
