package Array;
import java.util.Scanner;

public class secondlargele {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int secondlargest=-1;
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            if (arr[i]>=secondlargest && arr[i]<largest) {
                secondlargest=arr[i];
            }
        }
        System.out.println("The largest element of array is:"+ largest);
        System.out.println("The second largest element of the array is:"+ secondlargest);
    }
}
