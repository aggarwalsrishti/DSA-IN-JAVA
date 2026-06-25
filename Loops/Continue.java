package Loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER N ( 1 TO 20):");
        int n=sc.nextInt();
        for (int i=1 ; i<=20 ; i++){
            System.out.print(i);
            if (i==n){
                System.out.println();
                continue;
            }
            System.out.println("       HELLO WORLD");
        }
        sc.close();
    }
}
