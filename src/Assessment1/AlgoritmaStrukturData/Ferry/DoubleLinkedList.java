package Assessment1.AlgoritmaStrukturData.Ferry;

import java.util.Scanner;

public class DoubleLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        while (true) {
            System.out.println("Selamat datang di daftar item");
            System.out.println("Pilih operasi yang di jalankan: ");
            System.out.println("1. Menambahkan item ke daftar");
            System.out.println("2. Menghapus item dari daftar");
            System.out.println("3. Menampilkan semua Daftar");
            System.out.println("4. Quit");

            Scanner input = new Scanner(System.in);
            int choice = Integer.parseInt(input.next());

            switch(choice) {
                case 1:
                    System.out.println("Memasukan item yang akan di tambahkan ke daftar:");
                    int element = Integer.parseInt(input.next());
                    list.AddElem(element);
                    break;
                case 2:
                    System.out.println("Masukan posisi item yang ingin anda hapus dari daftar:");
                    int pos = Integer.parseInt(input.next());
                    System.out.println("daftar item " + list.RemoveElem(pos) + " telah di hapus.");
                    break;
                case 3:
                    list.view();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("data yang di masukan tidak benar, Please try again.");
                    break;
            }

        }
    }
}
