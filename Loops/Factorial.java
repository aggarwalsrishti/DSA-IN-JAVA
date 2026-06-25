package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        int x= sc.nextInt();
        int n=1;
        for(int i=1 ; i<=x ; i++){
            n*=i;
        }
        System.out.println("FACTORIAL:"+n);
        sc.close();
    }
}
