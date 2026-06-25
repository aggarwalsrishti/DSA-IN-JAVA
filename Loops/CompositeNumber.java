package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        int n=sc.nextInt();
        int a=1;
        for (int i=2 ; i<n ; i++){
            if (n%i==0){
                System.out.println("IT IS A COMPOSITE NUMBER");
                a=0;
                break;
            }
        }
        if(a==1){
            System.out.println("IT IS NOT A COMPOSITE NUMBER");
        }
        sc.close();
    }
}
