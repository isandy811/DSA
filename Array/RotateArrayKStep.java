//- Initialize array - take input and print arrays - Find max/min in array - Reverse array - Rotate array by k steps



package Arrays;
import java.util.*;
public class RotateArrayKStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            nums[i] = arr[i];
        }
        System.out.print("Enter k  :");
        int k = sc.nextInt();
        k = k % n;
        rotate(arr, 0, n - k - 1);
        rotate(arr, n - k, n - 1);
        rotate(arr, 0, n - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("min : " + arr[0]);
        System.out.println("max : " + arr[n - 1]);
        reverse1(nums,n);
        for(int x:nums){
            System.out.print(x+" ");
        }
    }

    public static void rotate(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverse1(int[] nums, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
