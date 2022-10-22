package com.latihan8.ferryPBO;

public class Makanan {
    private String nama;
    private String harga;
    private Lemak lmk;
    private Protein ptn;

    public Makanan(String nama, String harga) {
        this.nama = nama;
        this.harga = harga;
        //penciptaan objek di kelas pemanggil
        lmk = new Lemak();
        ptn = new Protein(2,6);
        //lmk = new Lemak("Lemak Jenuh", 3, 5);
        //ptn = new Protein(2, 3);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public void isiDetailLemak(String jenis, int jumlah, int akg) {
        lmk.setType(jenis);
        lmk.setJumlah(jumlah);
        lmk.setAkg(akg);
    }

    public void isiDetailProtein(int jumlah, int akg) {
        ptn.setJumlah(jumlah);
        ptn.setAkg(akg);
    }

    public void infoKomposisi() {
        System.out.println("Nama Makanan : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Lemak : ");
        lmk.infoLemak();
        System.out.println("Protein : ");
        ptn.infoProtein();
    }
}
