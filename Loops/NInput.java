package Loops;

import java.util.Scanner;

public class NInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER N:");
        int n=sc.nextInt();
        for( int i=1; i<=n ; i++){
            System.out.println("HELLOW WORLD");
        }
        sc.close();
    }
}
