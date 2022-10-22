package com.assesmentferry.praktikum;

public class Address {
    private String city;
    private String kodepos;
    private String alamatdetail;
    public Address(String city, String kodepos, String alamatdetail){
        this.city = city;
        this.kodepos = kodepos;
        this.alamatdetail = alamatdetail;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setKodepos(String kodepos){
        this.kodepos = kodepos;
    }
    public void setAlamatdetail(String alamatdetail){
        this.alamatdetail = alamatdetail;
    }
    public String getCity(){
        return city;
    }
    public String getKodepos(){
        return kodepos;
    }
    public String getAlamatdetail(){
        return alamatdetail;
    }
    public void infoAddress(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
