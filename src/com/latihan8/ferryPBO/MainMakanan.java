package com.latihan8.ferryPBO;

public class MainMakanan {
    public static void main(String[] args) {
        Makanan mkn = new Makanan("NasGor", "10000");

        mkn.isiDetailLemak("Lemak Jenuh", 1, 2);
        mkn.isiDetailProtein(1,2);

        mkn.infoKomposisi();

    }
}
