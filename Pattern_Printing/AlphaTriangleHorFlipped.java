package Pattern_Printing;

import java.util.Scanner;

public class AlphaTriangleHorFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO OF ROWS:");
        int n=sc.nextInt();
        int x;
        for (int i=n ; i>=1 ; i--){
            for ( int j=1 ; j<=i ; j++){
                x=j-1+ (int)'a';
                System.out.print((char)x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
