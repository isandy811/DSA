package Array;

import java.util.Scanner;

public class lineaarsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for( int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                ans=i;
            }
        }
        if(ans==1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Array at index :"+ans);
        }
    }
}
