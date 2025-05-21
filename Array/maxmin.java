import java.util.*;

public class maxmin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                min=arr[i];
            }
        }
    }
}