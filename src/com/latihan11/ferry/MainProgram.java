package com.latihan11.ferry;

public class MainProgram {
    public static void main(String [] args){
        Lingkaran lnk = new Lingkaran();
        Bola b = new Bola();

        lnk.setJarijari(10);
        System.out.println("Luas Lingkarang :" + lnk.luas());

        b.setJarijari(12);
        System.out.println (" Volume Bola :" + b.volume());
        System.out.println(" Luas Permukaan :" + b.luas());

        Lingkaran p = null;
        throw new AssertionError();

    }
}
