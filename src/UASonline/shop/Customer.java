package UASonline.shop;

import java.util.Scanner;
public class Customer {
    // inisialisasi scanner
    Scanner input = new Scanner(System.in);

    // deklarasi atribut
    private String name;
    private String age;
    private String email;
    private Account acc;
    private ShoppingCart sc;
    private DebitCard dc;
    int option;
    private boolean running = true;

    // konstruktor
    public Customer(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        acc = new Account("admin", "admin", 500000);
        sc = new ShoppingCart();
        dc = new DebitCard(1000000);

    }

    public void showProfile() {
        System.out.println("=============== My Profile ==============");
        System.out.println("| Nama: " + name);
        System.out.println("| Umur: " + age);
        System.out.println("| Email: " + email);
        System.out.println("| Username: " + acc.getUsername());
        System.out.println("| Password: " + acc.getPassword());
        System.out.println("| Balance: " + acc.getBalance());
        System.out.println("==========================================");
    }

    public void addToCart(Product product) {
        sc.addToCartProcess(product);
    }

    public void showFromCart() {
        sc.displayAllProduct();
    }

    public void checkOutFromCart() {
        double total = sc.calculateTotal();
        if (total <= acc.getBalance()) {
            acc.setBalance(acc.getBalance() - total);
            sc.resetShoppingCart();
        }
    }

    public boolean loginCheck(String username, String password) {
        System.out.print("Input Username: ");
        username = input.next();
        System.out.print("Input Password: ");
        password = input.next();
        if (acc.getUsername().equalsIgnoreCase(username) && acc.getPassword().equalsIgnoreCase(password)) {
            System.out.println("\nLogin Success ! ");
            showProfile();
            onlineShop();
            return true;
        } else {
            System.out.println("Username or Password is wrong ! \n");
            return false;
        }
    }

    public void topUpBalance(DebitCard d, double jumlah) {
        dc = d;
        System.out.print("Input Amount: ");
        jumlah = input.nextDouble();
        acc.setBalance(acc.getBalance() + jumlah);
    }

    public void DisplayWelcome() {
        while (running) {
            System.out.println("==========================================");
            System.out.println("|                Welcome                 |");
            System.out.println("==========================================");
            System.out.println("| 1. Login                               |");
            System.out.println("| 2. Register                            |");
            System.out.println("| 3. Check Debit Card Balance            |");
            System.out.println("| 0. Exit                                |");
            System.out.println("==========================================");
            System.out.print("Your Choice: ");
            int choice = input.nextInt();

            // looping menu
            if (choice == 1) {
                System.out.println("\n========== LOGIN MENU ==========");
                loginCheck(null, null);
            }
            if (choice == 2) {
                System.out.println("=============== REGISTER MENU ==============");
                System.out.print("Name: ");
                this.name = input.next();
                System.out.print("Age: ");
                this.age = input.next();
                System.out.print("Email: ");
                this.email = input.next();
                System.out.print("Username: ");
                acc.setUsername(input.next());
                System.out.print("Password: ");
                acc.setPassword(input.next());
                System.out.println("\nData created successfully !");
                showProfile();
            }
            if (choice == 3) {
                System.out.println("Your Credit Card Balance: \n" + dc.getBalance());
            }
            if (choice == 0) {
                System.exit(0);
            }
        }
    }

    // method untuk menjalankan online shop
    public void onlineShop() {
        while (running) {
            System.out.println("==========================================");
            System.out.println("|           Welcome to BFR Store         |");
            System.out.println("==========================================");
            System.out.println("| 1. Start Shopping                      |");
            System.out.println("| 2. Top Up Balance                      |");
            System.out.println("| 3. Show Profile                        |");
            System.out.println("| 99. Back To Menu                       |");
            System.out.println("==========================================");
            System.out.print("Your Choice: ");
            int pilih = input.nextInt();

            if (pilih == 1) {
                running = false;
            }
            if (pilih == 2) {
                topUpBalance(dc, 0);
                System.out.println("Top up balance successful !");
            }
            if (pilih == 3) {
                showProfile();
            }
            if (pilih == 99) {
                DisplayWelcome();
            }
        }
    }
}
