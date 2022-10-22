package kelas.abstrack.ferry;

public class Lingkaran extends Poligon {
    private double r;

    public Lingkaran() {    //default udah dibuat JVM

    }

    public Lingkaran(int r) {

    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double luas() {
        double luasLL  = 3.14*r*r;
        return luasLL;
    }

    public void setNamaPoligon(String namaPoligon) { //override yg tidak wajib - seusi kebutuhan
        super.namaPoligon = namaPoligon;
    }

    public void deskripsi() {       //wajib override
        System.out.println(namaPoligon);
        //super.deskripsi();
        System.out.println(luas());
    }
}
