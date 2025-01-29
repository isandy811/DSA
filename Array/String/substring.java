package Array.String;

import java.util.Scanner;

public class substring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a.substring(0,1));  //takes one or two parameter and print the string(doesn't takes the end index)
    }
}
