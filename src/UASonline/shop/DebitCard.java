package UASonline.shop;

public class DebitCard {
    // inisialisasi atribut
    private double balance;

    // konstruktor
    public DebitCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
