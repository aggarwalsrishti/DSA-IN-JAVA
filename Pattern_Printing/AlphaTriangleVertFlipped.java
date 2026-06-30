package Pattern_Printing;

import java.util.Scanner;

public class AlphaTriangleVertFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO OF ROWS:");
        int n=sc.nextInt();
        char x= 'A';
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=n ; j++){
                if (i+j>n){
                    System.out.print(x+ " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            x++;
            System.out.println();
            sc.close();
        }

    }
}
