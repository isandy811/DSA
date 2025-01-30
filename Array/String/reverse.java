// Java program to Reverse String

import java.util.Scanner;

class reverse {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.next();
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }

        for (int i = 0; i <s.length(); i++)

        System.out.println();
    }
}