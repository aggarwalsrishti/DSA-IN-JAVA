package Loops;

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        int n=sc.nextInt();
        for (int i=1 ; i<=10 ; i++){
            System.out.println(n +" X "+ i +" = " +(n*i));
        }
        sc.close();
    }
}
