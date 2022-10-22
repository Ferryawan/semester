package com.latihanPBO.ferry9;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean pro = true;
        Scanner why = new Scanner (System.in);
        Customer cs = new Customer(null , null , null);
        ShoppingCart sc = new ShoppingCart();
        Product p1 = new Product("Kurma" , 20 , 35000);
        Product p2 = new Product("Nastar" , 10 , 25000);
        Product p3 = new Product("Keripik Singkong" , 7 , 9500);
        Product p4 = new Product("Keripik Kentang" , 19 , 13750);
        Product p5 = new Product("Tango" , 40 , 20000);
        Product p6 = new Product("Timtam" , 5 , 9000);
        Product p7 = new Product("Ice Cream Cornetto" , 24 , 12000);
        Product p8 = new Product("Ice Cream Magnum" , 6 , 15000);
        Product p9 = new Product("Silver Queen" , 27 , 27000);
        Product p10 = new Product("Dairy Milk" , 18 ,22500);
        Product p11 = new Product("Teh Pucuk" , 33 , 3500);
        Product p12 = new Product("Granita" , 20 , 1500);
        Product p13 = new Product("Rokok Mild" , 66 , 25000);
        cs.hello();

        while(pro){
            System.out.println("|No | " + "Nama Barang \t\t\t\t\t| " + "Harga (Rp) \t\t\t| " + "Stok Barang \t| ");
            System.out.println("|1  | " + p1.getName() + " \t\t\t\t\t\t| " + p1.getPrice() + " \t\t\t| " + p1.getStock() + " \t\t| ");
            System.out.println("|2  | " + p2.getName() + " \t\t\t\t\t\t| " + p2.getPrice() + " \t\t\t| " + p2.getStock() + " \t\t| ");
            System.out.println("|3  | " + p3.getName() + " \t\t\t\t\t\t| " + p3.getPrice() + " \t\t\t| " + p3.getStock() + " \t\t| ");
            System.out.println("|4  | " + p4.getName() + " \t\t\t\t\t\t| " + p4.getPrice() + " \t\t\t| " + p4.getStock() + " \t\t| ");
            System.out.println("|5  | " + p5.getName() + " \t\t\t\t\t\t| " + p5.getPrice() + " \t\t\t| " + p5.getStock() + " \t\t| ");
            System.out.println("|6  | " + p6.getName() + " \t\t\t\t\t\t| " + p6.getPrice() + " \t\t\t| " + p6.getStock() + " \t\t| ");
            System.out.println("|7  | " + p7.getName() + " \t\t\t\t\t\t| " + p7.getPrice() + " \t\t\t| " + p7.getStock() + " \t\t| ");
            System.out.println("|8  | " + p8.getName() + " \t\t\t\t\t\t| " + p8.getPrice() + " \t\t\t| " + p8.getStock() + " \t\t| ");
            System.out.println("|9  | " + p9.getName() + " \t\t\t\t\t\t| " + p9.getPrice() + " \t\t\t| " + p9.getStock() + " \t\t| ");
            System.out.println("|10 | " + p10.getName() + " \t\t\t\t\t\t| " + p10.getPrice() + " \t\t\t| " + p10.getStock() + " \t\t| ");
            System.out.println("|11 | " + p11.getName() + " \t\t\t\t\t\t| " + p11.getPrice() + " \t\t\t| " + p11.getStock() + " \t\t| ");
            System.out.println("|12 | " + p12.getName() + " \t\t\t\t\t\t| " + p12.getPrice() + " \t\t\t| " + p12.getStock() + " \t\t| ");
            System.out.println("|13 | " + p13.getName() + " \t\t\t\t\t\t| " + p13.getPrice() + " \t\t\t| " + p13.getStock() + " \t\t| ");
            System.out.println();
            System.out.println("99.Tamplikan Kerangjang Belanja");
            System.out.println("0.Kembali Ke Menu Sebelumnya");
            System.out.print("Pilihan : ");
            int pilih = why.nextInt();

            if(pilih == 0){
                pro = false;
                System.out.println("Apakah anda ingin Kembali Kemenu Sebelumnya?");
                System.out.println("1.Ya");
                System.out.println("2.Tidak");
                int pilihan = why.nextInt();
                if(pilihan == 1){
                    cs.onlineShop();
                }
                if(pilihan == 2){
                    pro = true;
                }
            }
            if(pilih == 1){
                cs.addToCart(p1);
                p1.setStock(p1.getStock()-1);
            }
            if(pilih == 2){
                cs.addToCart(p2);
                p2.setStock(p2.getStock()-1);
            }
            if(pilih == 3){
                cs.addToCart(p3);
                p3.setStock(p3.getStock()-1);
            }
            if(pilih == 4){
                cs.addToCart(p4);
                p4.setStock(p4.getStock()-1);
            }
            if(pilih == 5){
                cs.addToCart(p5);
                p5.setStock(p5.getStock()-1);
            }
            if(pilih == 6){
                cs.addToCart(p6);
                p6.setStock(p6.getStock()-1);
            }
            if(pilih == 7){
                cs.addToCart(p7);
                p7.setStock(p7.getStock()-1);
            }
            if(pilih == 8){
                cs.addToCart(p8);
                p8.setStock(p8.getStock()-1);
            }
            if(pilih == 9){
                cs.addToCart(p9);
                p9.setStock(p9.getStock()-1);
            }
            if(pilih == 10){
                cs.addToCart(p10);
                p10.setStock(p10.getStock()-1);
            }
            if(pilih == 11){
                cs.addToCart(p11);
                p11.setStock(p11.getStock()-1);
            }
            if(pilih == 12){
                cs.addToCart(p12);
                p12.setStock(p12.getStock()-1);
            }
            if(pilih == 13){
                cs.addToCart(p13);
                p13.setStock(p13.getStock()-1);
            }
            if(pilih == 99){
                cs.showFromCart();
                pro = false;
                System.out.println();
                System.out.println("0.Checkout");
                System.out.print("Pilihan : ");
                int cek = why.nextInt();
                if(cek == 0){
                    cs.checkOutFromCart();
                    System.out.println("Tekan 1 untuk Melanjutkan");
                    System.out.print("Pilihan : ");
                    int cc = why.nextInt();
                    if(cc == 1){
                        pro = true;
                    }
                }
            }

        }
    }
}
