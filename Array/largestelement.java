package Array;

import java.util.Scanner;
 
public class largestelement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=0; i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
                //System.out.println(largest);
            }
        }
        System.out.println("Largest element is:"+ largest);
    }
}


//Second method
// import java.util.*;
// import java.io.*;

// public class largestelement{
//     static int largestElement(int[] arr,int n){
//         int largest=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>largest){
//                 largest=arr[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }


// class Solution {
//     public static int largest(int[] arr) {
//         // code here
//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         return max;
//     }
// }