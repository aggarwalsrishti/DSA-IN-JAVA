package Loops;

import java.util.Scanner;
import java.lang.Math;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A:");
        int a=sc.nextInt();
        System.out.print("ENTER R:");
        int r=sc.nextInt();
        System.out.print("ENTER N:");
        int n=sc.nextInt();
        for (int i=a ; i<= a*(Math.pow(r,n-1)) ; i*=r){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
