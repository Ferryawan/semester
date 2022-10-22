package com.latihan8.ferryPBO;

public class Lemak {
    private String type;
    private int jumlah;
    private int akg;

    //eclipse ide

    public Lemak() {
    }

    public Lemak(String type, int jumlah, int akg) {
        this.type = type;
        this.jumlah = jumlah;
        this.akg = akg;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setAkg(int akg) {
        this.akg = akg;
    }

    public String getType() {
        return type;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getAkg() {
        return akg;
    }

    public void infoLemak() {
        System.out.println("Type : " + type);
        System.out.println("Jumlah : " + jumlah + "g");
        System.out.println("AKG : " + akg + "%");
    }
}
