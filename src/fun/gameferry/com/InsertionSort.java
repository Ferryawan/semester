package fun.gameferry.com;

import java.util.Scanner;
 
/* Class InsertionSort */
public class InsertionSort 
{
    /* Insertion Sort function */
    public static void sort( int arr[] )
    {
        int N = arr.length;
        int i, j, temp;
        for (i = 1; i< N; i++) 
        {
            j = i;
            temp = arr[i];    
            while (j > 0 && temp < arr[j-1])
            {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;            
        }        
    }    
    /* Main method */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        System.out.println("Televisi");
        int n, i;
        /* Accept number of elements */
        System.out.println("Berapa Barang yang ingin di input ?");
       n = scan.nextInt();
        /* Create integer array on n elements */
        int arr[] = new int[ n ];
        /* Accept elements */
        System.out.println("\nInput "+ n +" Harga Barang"); 
        for (i = 0; i < n; i++){
         System.out.println("Input Harga barang ke : " +(i+1));
            arr[i] = scan.nextInt();
        }
        /* Call method sort */
        sort(arr);
        /* Print sorted Array */
        System.out.println("\nHarga Barang Setelah diurutkan ");        
        for (i = 0; i < n; i++)
            System.out.println("Harga Barang ke  " + (i+1) + " : " + arr[i]);                                
    }    
}