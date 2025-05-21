package Array;

import java.util.Scanner;  

public class binarysearch {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        int arr[] = new int[n];  
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        }  
        int target = sc.nextInt();  
        int low = 0;  
        int high = n - 1;  
        int result = -1;  // To store the index of target  
        
        while (low <= high) {  
            int mid_index = low + (high - low) / 2;  
            if (arr[mid_index] == target) {  
                result = mid_index; // Target found  
                break; // Exit the loop  
            } 
            else if (arr[mid_index] < target) {  
                low = mid_index + 1;  
            } 
            else {  
                high = mid_index - 1;  
            }  
        }  
        
        if (result != -1) {  
            System.out.println("Element found at index: " + result);  
        } else {  
            System.out.println("Element not found.");  
        }  
    }  
}
