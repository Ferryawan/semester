package com.assesmentferry.praktikum;

public class Contact {
    private String email;
    private String nohp;
    private String nama;
    private String alamat;
    public Contact (String email, String nohp, String nama, String alamat){
        this.email = email;
        this.nohp = nohp;
        this.nama = nama;
        this.alamat = alamat;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNohp(String nohp){
        this.nohp = nohp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getEmail(){
        return email;
    }
    public String getNohp(){
        return nohp;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void infoContact(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
