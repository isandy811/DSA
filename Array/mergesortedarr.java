package Array;

import java.util.Arrays;
import java.util.Scanner;

public class mergesortedarr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }

        //declare two pointers
        int left=n-1;
        int right=0;
        while(left>=0 && right<m){
            if(arr1[left]>arr2[right]){
                long temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=(int) temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Print the merged arrays
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (long num : arr1) {
            System.out.print(num + " ");
        }
        System.out.print("\narr2[] = ");
        for (long num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
