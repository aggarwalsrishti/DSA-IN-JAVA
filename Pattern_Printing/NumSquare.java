package Pattern_Printing;

import java.util.Scanner;

public class NumSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NO OF SIDE:");
        int x= sc.nextInt();
        for ( int i=1 ; i<=x ; i++){
            for ( int j=1; j<=x ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
