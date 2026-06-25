package Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A:");
        int a=sc.nextInt();
        System.out.print("ENTER D:");
        int d=sc.nextInt();
        System.out.print("ENTER N:");
        int n=sc.nextInt();
        for (int i=a ; i<= a+ (n-1)*d ; i+=d){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
