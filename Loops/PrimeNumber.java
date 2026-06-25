package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        int n=sc.nextInt();
        int a=1;
        for (int i=2 ; i<n ; i++){
            if (n%i==0){
                a=0;
                break;
            }
        }
        if (a==1){
            System.out.println("IT IS A PRIME NUMBER");
        }
        else{
            System.out.println("IT IS NOT A PRIME NUMBER");
        }
        sc.close();
    }
}
