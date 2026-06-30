package Pattern_Printing;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO OF ROWS:");
        int n=sc.nextInt();
        for (int j=1 ; j<=2*n-1 ; j++){
                System.out.print("* ");
        }
        System.out.println();
        for (int i=1; i <=n-1 ; i++){
            for (int k=1 ; k<=n-1; k++){
                if (i+k<=n){
                    System.out.print("* ");}
                }
            for (int m=1 ; m<=2*i -1; m++){
                System.out.print("  ");
            }    
            for (int p=1 ; p<=n-1 ; p++){
                if (i+p<=n){
                System.out.print("* ");}
            }

            
            System.out.println();
        }
        sc.close();
    }
}
