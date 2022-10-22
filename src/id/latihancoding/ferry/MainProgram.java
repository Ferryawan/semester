package id.latihancoding.ferry;

public class MainProgram {
    public static void main(String [] args){
        Makanan mkn = new Makanan(" INDOMIE",10000);
        mkn.isiDetailLemak("Lemak jenuh", 1,3);
        mkn.isiDetailProtein(1,2);

        mkn.infoKomposisi();
    }
}
