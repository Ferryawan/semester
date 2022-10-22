package kelas.abstrack.ferry;

abstract class Poligon { //bangun datar : lingkaran, segiempat, dll
    protected String namaPoligon;

    public void setNamaPoligon(String namaPoligon) {
        this.namaPoligon = namaPoligon;
    }

    public String getNamaPoligon() {
        return namaPoligon;
    }

    abstract void deskripsi();
}