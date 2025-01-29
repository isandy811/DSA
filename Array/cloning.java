package Array;

import java.util.Scanner;

public class cloning {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array: ");
        //Callling function to print an array...
        printArray(arr);
        
        //trying to copy the first array...
        int [] arr_2=arr;

        // to print an array...
        // for(int i=0;i<n;i++){
        //     System.out.print(arr_2[i]+" ");
        // }

        System.out.println("Copied Array: ");

        //calling function to print an array...
        printArray(arr_2);

        //changing some values of array 2...
        arr_2[2]=7;
        arr_2[4]=0;

        System.out.println("Original array after changing the array2 elements: ");
        printArray(arr);

        System.out.println("Copied arrya after changing its elements: ");
        printArray(arr_2);


    }
}
