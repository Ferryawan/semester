package semester3.ferry;

import java.util.Scanner;

public class Jurnal1 {
    public static void main (String [] args){
        int x,y;
        Scanner scan = new Scanner(System.in);
        System.out.print("nilai x : ");
        x = scan.nextInt();
        System.out.print("nilai y : ");
        y = scan.nextInt();
        int [][] data = new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                data[i][j]=scan.nextInt();
            }}
        System.out.println(" ");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(data[i][j]+" ");
            }System.out.println(" ");}
    }
}
