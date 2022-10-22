package UASonline.shop;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // inisialisasi scanner
        Scanner input = new Scanner(System.in);

        // deklarasi atribut
        boolean runinng = true;

        // komposisi objek
        Customer cs = new Customer(null, null, null);
        ShoppingCart sc = new ShoppingCart();
        Product p1 = new Product("LAPTOP 1", 2, 100000);
        Product p2 = new Product("LAPTOP 2", 2, 120000);
        Product p3 = new Product("LAPTOP 3", 2, 140000);
        Product p4 = new Product("LAPTOP 4", 2, 160000);
        Product p5 = new Product("LAPTOP 5", 2, 180000);
        Product p6 = new Product("LAPTOP 6", 2, 200000);
        Product p7 = new Product("LAPTOP 7", 2, 220000);
        Product p8 = new Product("LAPTOP 8", 2, 240000);
        Product p9 = new Product("LAPTOP 9", 2, 260000);
        Product p10 = new Product("LAPTOP 10", 2, 280000);
        Product p11 = new Product("LAPTOP 11", 2, 300000);
        Product p12 = new Product("LAPTOP 12", 2, 320000);
        Product p13 = new Product("LAPTOP 13", 2, 340000);

        Product2 p20 = new Product2("KOMPUTER 20", 2, 100000);
        Product2 p21 = new Product2("KOMPUTER 21", 2, 120000);
        Product2 p22 = new Product2("KOMPUTER 22", 2, 140000);
        Product2 p23 = new Product2("KOMPUTER 23", 2, 160000);
        Product2 p24 = new Product2("KOMPUTER 24", 2, 180000);
        Product2 p25 = new Product2("KOMPUTER 25", 2, 200000);
        Product2 p26 = new Product2("KOMPUTER 26", 2, 220000);
        Product2 p27 = new Product2("KOMPUTER 27", 2, 240000);
        Product2 p28 = new Product2("KOMPUTER 28", 2, 260000);
        Product2 p29 = new Product2("KOMPUTER 29", 2, 280000);
        Product2 p30 = new Product2("KOMPUTER 30", 3, 300000);
        cs.DisplayWelcome();

        // looping menu
        while (runinng) {
            System.out.println("------------------------------------------");
            System.out.println("| # | Product Name | Price | Stock |");
            System.out.println("------------------------------------------");
            System.out.println(
                    "| 1  | " + p1.getName() + " | " + p1.getPrice() + " | " + p1.getStock() + " |");
            System.out.println(
                    "| 2  | " + p2.getName() + " | " + p2.getPrice() + " | " + p2.getStock() + " |");
            System.out.println(
                    "| 3  | " + p3.getName() + " | " + p3.getPrice() + " | " + p3.getStock() + " |");
            System.out.println(
                    "| 4  | " + p4.getName() + " | " + p4.getPrice() + " | " + p4.getStock() + " |");
            System.out.println(
                    "| 5  | " + p5.getName() + " | " + p5.getPrice() + " | " + p5.getStock() + " |");
            System.out.println(
                    "| 6  | " + p6.getName() + " | " + p6.getPrice() + " | " + p6.getStock() + " |");
            System.out.println(
                    "| 7  | " + p7.getName() + " | " + p7.getPrice() + " | " + p7.getStock() + " |");
            System.out.println(
                    "| 8  | " + p8.getName() + " | " + p8.getPrice() + " | " + p8.getStock() + " |");
            System.out.println(
                    "| 9  | " + p9.getName() + " | " + p9.getPrice() + " | " + p9.getStock() + " |");
            System.out.println(
                    "| 10 | " + p10.getName() + " | " + p10.getPrice() + " | " + p10.getStock() + " |");
            System.out.println(
                    "| 11 | " + p11.getName() + " | " + p11.getPrice() + " | " + p11.getStock() + " |");
            System.out.println(
                    "| 12 | " + p12.getName() + " | " + p12.getPrice() + " | " + p12.getStock() + " |");
            System.out.println(
                    "| 13 | " + p13.getName() + " | " + p13.getPrice() + " | " + p13.getStock() + " |");
            System.out.println("------------------------------------------");
            System.out.println("\n Product 2");
            System.out.println("------------------------------------------");
            System.out.println(
                    "| 14  | " + p20.getName() + " | " + p20.getPrice() + " | " + p20.getStock() + " |");
            System.out.println(
                    "| 15  | " + p21.getName() + " | " + p21.getPrice() + " | " + p21.getStock() + " |");
            System.out.println(
                    "| 16  | " + p22.getName() + " | " + p22.getPrice() + " | " + p22.getStock() + " |");
            System.out.println(
                    "| 17  | " + p23.getName() + " | " + p23.getPrice() + " | " + p23.getStock() + " |");
            System.out.println(
                    "| 18  | " + p24.getName() + " | " + p24.getPrice() + " | " + p24.getStock() + " |");
            System.out.println(
                    "| 19  | " + p25.getName() + " | " + p25.getPrice() + " | " + p25.getStock() + " |");
            System.out.println(
                    "| 20  | " + p26.getName() + " | " + p26.getPrice() + " | " + p26.getStock() + " |");
            System.out.println(
                    "| 21  | " + p27.getName() + " | " + p27.getPrice() + " | " + p27.getStock() + " |");
            System.out.println(
                    "| 22  | " + p28.getName() + " | " + p28.getPrice() + " | " + p28.getStock() + " |");
            System.out.println(
                    "| 23  | " + p29.getName() + " | " + p29.getPrice() + " | " + p29.getStock() + " |");
            System.out.println(
                    "| 24  | " + p30.getName() + " | " + p30.getPrice() + " | " + p30.getStock() + " |");
            System.out.println("99. Show Cart");
            System.out.println("0. Exit");
            System.out.print("\nYour Choice: ");
            int choice = input.nextInt();

            // if else untuk memilih menu
            if (choice == 0) {
                runinng = false;
                System.out.println("\nAre you sure ?");
                System.out.println("1.Yes");
                System.out.println("2.No ");
                System.out.print("Your Choice: ");
                int option = input.nextInt();
                if (option == 1) {
                    System.out.println("\nThank you for using our program.");
                }
                if (option == 2) {
                    runinng = true;
                }
            }
            if (choice == 1) {
                cs.addToCart(p1);
                p1.setStock(p1.getStock() - 1);
            }
            if (choice == 2) {
                cs.addToCart(p2);
                p2.setStock(p2.getStock() - 1);
            }
            if (choice == 3) {
                cs.addToCart(p3);
                p3.setStock(p3.getStock() - 1);
            }
            if (choice == 4) {
                cs.addToCart(p4);
                p4.setStock(p4.getStock() - 1);
            }
            if (choice == 5) {
                cs.addToCart(p5);
                p5.setStock(p5.getStock() - 1);
            }
            if (choice == 6) {
                cs.addToCart(p6);
                p6.setStock(p6.getStock() - 1);
            }
            if (choice == 7) {
                cs.addToCart(p7);
                p7.setStock(p7.getStock() - 1);
            }
            if (choice == 8) {
                cs.addToCart(p8);
                p8.setStock(p8.getStock() - 1);
            }
            if (choice == 9) {
                cs.addToCart(p9);
                p9.setStock(p9.getStock() - 1);
            }
            if (choice == 10) {
                cs.addToCart(p10);
                p10.setStock(p10.getStock() - 1);
            }
            if (choice == 11) {
                cs.addToCart(p11);
                p11.setStock(p11.getStock() - 1);
            }
            if (choice == 12) {
                cs.addToCart(p12);
                p12.setStock(p12.getStock() - 1);
            }
            if (choice == 13) {
                cs.addToCart(p13);
                p13.setStock(p13.getStock() - 1);
            }
            if (choice == 14) {
                cs.addToCart(p20);
                p20.setStock(p20.getStock() - 1);
            }
            if (choice == 15) {
                cs.addToCart(p21);
                p21.setStock(p21.getStock() - 1);
            }
            if (choice == 16) {
                cs.addToCart(p22);
                p22.setStock(p22.getStock() - 1);
            }
            if (choice == 17) {
                cs.addToCart(p23);
                p23.setStock(p23.getStock() - 1);
            }
            if (choice == 18) {
                cs.addToCart(p24);
                p24.setStock(p24.getStock() - 1);
            }
            if (choice == 19) {
                cs.addToCart(p25);
                p25.setStock(p25.getStock() - 1);
            }
            if (choice == 20) {
                cs.addToCart(p26);
                p26.setStock(p26.getStock() - 1);
            }
            if (choice == 21) {
                cs.addToCart(p27);
                p27.setStock(p27.getStock() -1);
            }
            if (choice == 22) {
                cs.addToCart(p28);
                p28.setStock(p28.getStock() - 1);
            }
            if (choice == 23) {
                cs.addToCart(p29);
                p29.setStock(p29.getStock() - 1);
            }
            if (choice == 24) {
                cs.addToCart(p30);
                p30.setStock(p30.getStock() -1);
            }
            if (choice == 99) {
                cs.showFromCart();
                runinng = false;
                System.out.println();
                System.out.println("0.Checkout");
                System.out.print("Your choice: ");
                int option = input.nextInt();
                if (option == 0) {
                    cs.checkOutFromCart();
                    System.out.println("Press 1 to continue");
                    System.out.print("Your choice: ");
                    int cc = input.nextInt();
                    if (cc == 1) {
                        runinng = true;
                    }
                }
            }
        }
    }
}
