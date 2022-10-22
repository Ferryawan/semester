package kls.kelasabstract.ferry;

abstract class Poligon {
    protected String namaPoligon;

    public void setNamaPoligon(String namaPoligon) {
        this.namaPoligon = namaPoligon;
    }

    public String getNamaPoligon() {
        return namaPoligon;
    }

    abstract void deskripsi();
}