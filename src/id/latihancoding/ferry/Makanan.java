package id.latihancoding.ferry;

public class Makanan {
    private String nama;
    private int harga;
    private Lemak lmk;
    private Protein ptn;

    public Makanan (String nama, int harga){
        this.nama = nama;
        this.harga = harga;
        lmk = new Lemak();
        ptn = new Protein(2,5);
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setHarga(String harga){
        this.harga = Integer.parseInt(harga);
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public void isiDetailLemak(String jenis, int jumlah, int akg){
        lmk.setType(jenis);
        lmk.setJumlah(jumlah);
        lmk.setAkg(akg);
    }
    public void isiDetailProtein(int jumlah, int akg){
        ptn.setJumlah(jumlah);
        ptn.setAkg(akg);
    }
    public void infoKomposisi(){
        System.out.println( "Nama Makanan : "+nama);
        System.out.println( " Harga : "+harga);
        System.out.println( " Lemak : ");
        lmk.infoLemak();
        System.out.println( " Protein : ");
        ptn.infoProtein();
    }
}
