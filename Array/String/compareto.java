package Array.String;

import java.util.Scanner;

class compareto{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(a.compareTo(b)); //gives 0(if both strings are equal), -1(if first string is smaller than second) and 1(if a>b)
    }
}