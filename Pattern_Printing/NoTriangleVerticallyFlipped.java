package Pattern_Printing;

import java.util.Scanner;

public class NoTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO OF ROWS:");
        int n=sc.nextInt();
        int a;
        for (int i=1 ; i<=n ; i++){
            a=1;
            for ( int j=1 ; j<=n ; j++){
                if (i+j>n){
                    System.out.print((a++) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        sc.close();
    }
}
