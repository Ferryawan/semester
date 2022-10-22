package com.latihanPBO.ferry9;
 import java.util.Scanner;

public class Customer {
    Scanner why = new Scanner (System.in);
    private String nama;
    private String age;
    private String email;
    private Account acc;
    private ShoppingCart sc;
    private DebitCard dc;
    int pilih;
    private boolean menu = true;

    public Customer(String nama, String age, String email) {
        this.nama = nama;
        this.age = age;
        this.email = email;
        acc = new Account("Ferry" , "898963" , 50000);
        sc = new ShoppingCart();
        dc = new DebitCard(1000000);

    }

    public void showProfile(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + age);
        System.out.println("Email: " + email);
        System.out.println("Username: " + acc.getUsername());
        System.out.println("Password: " + acc.getPassword());
        System.out.println("Balance: " + acc.getBalance());
    }

    public void addToCart(Product product){
        sc.addToCartProcess(product);
    }

    public void showFromCart(){
        sc.displayAllProduct();
    }

    public void checkOutFromCart(){
        double total = sc.calculateTotal();
        if(total <= acc.getBalance()){
            acc.setBalance(acc.getBalance() - total);
            sc.resetShoppingCart();
        }
    }

    public boolean loginCheck(String username , String password){
        System.out.print("Input Username: ");
        username = why.next();
        System.out.print("Input Password: ");
        password = why.next();
        if(acc.getUsername().equalsIgnoreCase(username) &&acc.getPassword().equalsIgnoreCase(password)){
            System.out.println("Login Berhasil");
            showProfile();
            onlineShop();
            return true;
        }
        else{
            System.out.println("Username atau Password Salah");
            return false;
        }
    }

    public void topUpBalance(DebitCard d , double jumlah){
        dc = d;
        System.out.print("Input Jumlah : ");
        jumlah = why.nextDouble();
        acc.setBalance(acc.getBalance()+jumlah);
    }
    public void hello(){
        while (menu){
            System.out.println("|______________Pilih Menu______________|");
            System.out.println("|1.Login                               |");
            System.out.println("|2.Register                            |");
            System.out.println("|3.Cek Saldo Kartu Kredit              |");
            System.out.println("|99.Logout                             |");
            int pilih = why.nextInt();

            if (pilih == 1){
                System.out.println("++++++++++LOGIN MENU++++++++++");
                loginCheck(null, null);

            }
            if (pilih == 2){
                System.out.println("++++++++++REGISTER MENU++++++++++");
                System.out.print("Nama :" );
                this.nama = why.next();
                System.out.print("Umur :" );
                this.age = why.next();
                System.out.print("Email :" );
                this.email = why.next();
                System.out.println("Username: ");
                acc.setUsername(why.next());
                System.out.println("Password: ");
                acc.setPassword(why.next());
                System.out.println("Data Berhasil dibuat!!");
                showProfile();
            }
            if(pilih == 3){
                System.out.println("Saldo Kartu Kredit Anda : " + dc.getBalance());
            }
            if(pilih == 99){
                System.exit(0);
            }
        }
    }
    public void onlineShop(){
        while (menu){
            System.out.println("|______________Selamat Datang di Shopee________________|");
            System.out.println("|1.Mulai Belanja                                       |");
            System.out.println("|2.Top Up SCash                                        |");
            System.out.println("|3.Informasi Akun                                      |");
            System.out.println("|99.Kembali Ke Menu Login                              |");
            int pilih = why.nextInt();

            if (pilih == 1){
                menu = false;
            }
            if(pilih == 2){
                topUpBalance(dc , 0);
                System.out.println("Top up Saldo Berhasil");
            }
            if (pilih == 3){
                showProfile();
            }
            if(pilih == 99){
                hello();
            }
        }
    }
}
