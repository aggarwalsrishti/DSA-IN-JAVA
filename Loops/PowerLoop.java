package Loops;

import java.util.Scanner;

public class PowerLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER BASE:");
        int b=sc.nextInt();
        System.out.print("ENTER POWER:");
        int p=sc.nextInt();
        int result=1;
        for ( int i=1; i<=p ; i++){
            result*=b;
        }
        System.out.println("RESULT:"+result);
        sc.close();
    }
}
