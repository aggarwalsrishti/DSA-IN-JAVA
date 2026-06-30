package Pattern_Printing;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NO OF COLUMN:");
        int x=sc.nextInt();
        System.out.print("ENTER NO OF ROW:");
        int y=sc.nextInt();
        for ( int i=1 ; i<=y ; i++){
            for ( int j=1 ; j<=x ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
