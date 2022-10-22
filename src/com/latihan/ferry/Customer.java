package com.latihan.ferry;

import org.jetbrains.annotations.NotNull;

public class Customer {
    private String nama;
    private String age;
    private String email;
    private Account acc;
    private ShoppingCart sc;
    private DebitCard db;   //asosiasi

    public Customer(String nama, String age, String email) {
        this.nama = nama;
        this.age = age;
        this.email = email;
        //komposisi
        acc = new Account(email, "123456");
        sc = new ShoppingCart();
    }

    public void showProfile() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + age);
        System.out.println("Email : " + email);
        System.out.println("Username : " + acc.getUsername());
        System.out.println("Password : " + acc.getPassword());
        System.out.println("Balance : " + db.getBalance());
    }

    public void addToCart(Product product) {
        sc.addToCartProcess(product);
    }

    public void showFromCart() {
        sc.displayAllProduct();
    }

    public void checkOutFromCart() {
        double total = sc.calculateTotal();
        db.setBalance(db.getBalance() - total); //1. dilanjutkan secara logic
        sc.resetShoppingCart();
    }

    public boolean loginCheck(String username, String password) {
        //2. logic pergantian password jika password masih default 123456
        if(username.equals(acc.getUsername()) && password.equals(acc.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public void topUpBalance(DebitCard db, double topup) {
        this.db = db;
        db.setBalance(db.getBalance() + topup); //3. pembatasan jumlah topup maksimal 1 juta
    }
}
