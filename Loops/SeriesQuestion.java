package Loops;

import java.util.Scanner;

public class SeriesQuestion {
    public static void main(String[] args) {
        /*
        Take 'n' as input from user and print the following sequence..
        1
        n
        2
        n-1
        3
        n-2
        ....
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER N:");
        int n=sc.nextInt();
        int x=n;
        for(int i=1 ; i<=((n%2==0) ? (n/2) : ((n/2)+1)) ; i++){
            System.out.println(i);
            System.out.println(x--);
        }
        sc.close();
    }

}
