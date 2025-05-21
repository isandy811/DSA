package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.print(arr[i]+" ");

        // Display the reversed array
        // System.out.println("Reversed Array:");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        
        sc.close();
    }
}
