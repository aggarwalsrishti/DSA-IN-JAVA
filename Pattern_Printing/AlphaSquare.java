package Pattern_Printing;

import java.util.Scanner;

public class AlphaSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NO OF SIDE:");
        int x=sc.nextInt();
        for ( int i=1 ; i<=x ; i++){
            for ( int j=(int)'A' ; j<((int)'A')+x ; j++){
                System.out.print(((char)j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
