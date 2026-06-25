package Loops;

import java.util.Scanner;

public class PositiveSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A:");
        int a=sc.nextInt();
        System.out.print("ENTER D:");
        int d=sc.nextInt();
        for (int i=a ; i>= 0 ; i+=d){
            if (i>0){
                System.out.print(i+" ");
            }
            
        }
        sc.close();
    }
}
