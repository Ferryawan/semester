package id.latihancoding.ferry;

public class Protein {
    private int jumlah;
    private int akg;
    public Protein(int jumlah, int akg){
        this.jumlah = jumlah;
        this.akg = akg;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public void setAkg(int akg){
        this.akg = akg;
    }
    public int getJumlah(){
        return jumlah;
    }
    public int getAkg(){
        return akg;
    }
    public void infoProtein(){
        System.out.println(" Jumlah : "+jumlah+ "g");
        System.out.println( " AKG : "+akg+ "%");
    }
}
