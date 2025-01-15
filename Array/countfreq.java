package Array;
import java.util.Scanner;

public class countfreq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                
            }
        }
        System.out.println(count);
    }
}
