package Array;
import java.util.Arrays;
import java.util.Scanner;

public class countoccurence{
    public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<n-1;i++){
            //int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                    count++;
                else{
                    break;
                }    
            }
        }
        int i;
                System.out.println(arr[i]+"count is"+ count);
                i+=(count-1);

    }
}