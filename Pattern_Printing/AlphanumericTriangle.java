package Pattern_Printing;

import java.util.Scanner;

public class AlphanumericTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO OF ROW:");
        int n=sc.nextInt();
        int a;
        for (int i=1 ; i<=n ; i++){
            if (i%2==0){
                for ( int j=1 ; j<=i ; j++){
                    a=j-1+(int)'A';
                    System.out.print((char)a+" ");
                }
            }
            else{
                for ( int k=1 ; k<=i; k++){
                    System.out.print(k+" ");
                }
            }
            System.out.println();
            }
        sc.close(); 
    }
}
