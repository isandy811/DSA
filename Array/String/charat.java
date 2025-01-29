package Array.String;

import java.util.Scanner;

class charat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String a=sc.nextLine();
        System.out.println(a.charAt(0));  //print the 0th index of string a

        char ch = sc.next().charAt(0);  //input a single character
        System.out.println(ch);
    }
}