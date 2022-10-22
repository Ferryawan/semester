package latihan.ferry9;
import java.util.Scanner;
public class LatihanArray {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        //deklarasi array
        //tipeDatavnamaArray[] = new tipeData[jumlahData]
        int arrAngka[] =new int[10];
        char arrChar[] =new char[100];
        float arrFloat[] =new float[10];
        String arrString[] = new String[10];

        //isi data array
        arrAngka[0] = 10;
        arrAngka[1] = 7;

        arrChar[0] = 'A';
        arrChar[1] = 'B';

         arrFloat[0] = (float) 8.7;
         arrFloat[1] = (float) 6.3;
         arrFloat[2] = 6;

        arrString[0] = "Algoritma";
        arrString[1] = "Struktur Data";

        System.out.println("Berapa Angka Yang mau diinput? 1-10");
        int input = angka.nextInt();
        if(input<1||input>10){
            System.out.println("Hanya 1 sampai 10");
        }else{
            //isi array menggunakan looping
            for(int i = 0; i < 10; i++){
                arrAngka[i] = i+2;
            }
            //mengambil data array
            System.out.println(arrAngka);
            System.out.println(arrChar[1]);

            //mengambil data array menggunakan looping
            for(int i = 0; i < 2; i++){
                System.out.println(arrChar[i]);
            }

            //isi array angka menggunakan input user 5 kali
            for(int i = 0; i < input; i++){
                System.out.print("Input Angka ke " +(i+1)+" : ");
                arrAngka[i] = angka.nextInt();
                if(arrAngka[i]%2 != 0){
                    System.out.println("Angka tidak sesuai");
                    break;
                }
            }
            for(int i = 0; i < input; i++){
                System.out.println();
                System.out.print("Angka ke "+(i+1)+ " adalah :" +arrAngka[i]);
            }
        }
    }
}
