package com.latihanPBO.ferry9;

public class ShoppingCart {
    private Product listProduct[];
    private int productCount;

    public ShoppingCart() {
        listProduct = new Product[25];
        productCount = 0;
    }

    public void addToCartProcess(Product product){
        this.listProduct[productCount] = product;
        this.productCount++;
    }

    public double calculateTotal(){
        double total = 0;
        for(int i = 0 ; i < productCount ; i++){
            total += listProduct[i].getPrice();
        }
        System.out.println("Total Harga : " + total);
        return 0;
    }

    public void displayAllProduct(){
        for(int i = 0 ; i < productCount ; i++){
            System.out.println("|1  | " + listProduct[i].getName() + " \t\t\t\t\t\t| " + listProduct[i].getPrice() + " \t\t\t| ");

        }
        System.out.println("Jumlah Barang Dikeranjang Belanja : " + productCount);
    }

    public int getProductCount(){
        return productCount;
    }

    public void resetShoppingCart(){
        listProduct = new Product[25];
        productCount = 0;
    }
}
