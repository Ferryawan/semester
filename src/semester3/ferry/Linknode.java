package semester3.ferry;

import java.util.Scanner;//membuat sebuah fungsi scanner
public class Linknode{ //membaut class bernama Linknode
    Node kepala; //kepala atau  data pertama
    public void tambah(int data) //pembuatan funsi tambah
    {
        Node baru= new Node(data); //pembuatan objek baru
        if(kepala!=null) //jika data pertama belum dimasukkan
        {
            baru.next=kepala; //menyambugkan baru dengan kepala
            kepala=baru;//data pertama adalah objek baru
        }
        else //jika sudah terisi data pertama maka
        {
            kepala=baru; //kepala adalah data  baru
            kepala.next=null;
        }
    }
    public void tambahakhir(int data) //fungsi tambah akhir
    {
        Node baru=new Node(data); //membuat objek baru
        Node bantu; //membuat node bantu
        bantu=kepala; //menginisialisasi bantu adalah kepala
        while(bantu.next!=null) //perulangan while untuk mencari
        {
            bantu=bantu.next;//menjalankan bantu hingga null/kosong
        }
        bantu.next=baru;//menyimpan nilai setiap pergerakan di data baru
    }

    public void tampil() //menampiilkan data
    {
        Node curent; //sama seperti node bantu
        curent=kepala; //sama juga
        while(curent!=null) //perulangan while pencarian
        {
            System.out.print("{"+curent.data+"}");  //menampilkan data dari curent.
            curent=curent.next; //menjalankan curent
        }
    }

    public Node hapusawal() //fungsi hapus awal
    {
        Node a=kepala; //menginisialisasi a adlah kepala
        kepala=kepala.next; //kepala adalah data selanjutnya
        a.next=null; //a selanjutnya adalah kosong
        return a; //kembali ke a
    }

    public Node hapusakhir() //membuat  fungsi hapus data terakhir
    {
        Node c=kepala;
        while(c.next.next!=null)
        {
            c=c.next;
        }
        c.next=null;
        return c;
    }

    public void hapusall()
    {
        Node curent;
        curent=kepala;
        curent=null;
        if(curent==null)
        {
            System.out.print("{kosong}");
        }
    }
    public static void main(String[] args)//fungsi utama
    {
        Linknode x=new Linknode();//membuat objek baru x
        Scanner  in=new Scanner(System.in); //membuat fungsi scanner untuk input
        int a;
        System.out.println("       Silahkan Input data"       );
        for(int i=0 ; i<6; i++)
        {
            a=in.nextInt(); //input data
            x.tambah(a); //panggil fungsi tambah
        }
        System.out.println("Output");
        x.tampil(); //menampilkan data
        x.hapusawal(); //panggil fungsi hapus awal
        System.out.println();
        System.out.println("Output");
        x.tampil();
        System.out.println();
        x.hapusawal();
        System.out.println();
        System.out.println("Output");
        x.tampil();
        System.out.println();
        System.out.println("Silahkan Input data");
        a=in.nextInt();
        x.tambahakhir(a);
        a=in.nextInt();
        x.tambahakhir(a);
        x.tampil();
        System.out.println();
        System.out.println("Silahkan Input data");
        a=in.nextInt();
        x.tambah(a);
        x.tampil();
        x.hapusakhir();
        x.hapusakhir();
        System.out.println();
        x.tampil();
        System.out.println();
        System.out.println("Data sekarang");
        x.hapusall();
    /*x.hapusakhir();
    x.tampil();
    System.out.println();
    System.out.println("Silahkan input nilai akhir node);
    a=in.nextInt();
    x.tambahakhir(a);
    x.tampil();*/
    }   }