package Pattern_Printing;

import java.util.Scanner;

public class AlphaLowerUpper {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NO OF SIDE:");
        int x= sc.nextInt();
        int a=0;
        for ( int i=1 ; i<=x ; i++){
            if (a%2==0){
                a=((int)'a')+i-1;
            }
            else{
                a=((int)'A')+i-1;
            }
            for ( int j=1; j<=x ; j++){
                System.out.print((char)a+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
