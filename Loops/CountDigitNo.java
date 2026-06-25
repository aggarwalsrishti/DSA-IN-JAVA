package Loops;

import java.util.Scanner;

public class CountDigitNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        int n=sc.nextInt();
        int x=0;
        while (n!=0){
            n=n/10;
            x++;
        }
        System.out.println("TOTAL DIGITS:"+x);
        sc.close();
    }
}
