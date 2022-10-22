package com.assesmentferry.praktikum;

public class ContactGroup {
    private String namagroup;
    private String contact;
    private String anggota;
    public ContactGroup(String namagroup, String contact, String anggota){
       this.namagroup = namagroup;
       this.contact = contact;
       this.anggota = anggota;
    }
    public void setNamagroup(String namagroup){
        this.namagroup = namagroup;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public void setAnggota(String anggota){
        this.anggota = anggota;
    }
    public String getNamagroup(){
        return namagroup;
    }
    public String getContact(){
        return contact;
    }
    public String getAnggota(){
        return anggota;
    }
    public void infoContactGroup(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
