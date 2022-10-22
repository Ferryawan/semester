package com.latihan11.ferry;

public class Piring {
    private double piring;

    public Piring (double piring){
        this.piring = piring;
    }
    public Piring(){

    }
    public void setPiring(double piring){
        this.piring = piring;
    }
    public double getPiring(){
        return piring;
    }
    public void ukuranPiring(){
        System.out.println("ukuran piring 26cm");
    }
}
