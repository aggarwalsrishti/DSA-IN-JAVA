package Pattern_Printing;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO OF ROWS:");
        int n=sc.nextInt();
        
        for (int i=1; i<=n ; i++){
            for (int j=1 ; j<=n ; j++){
                if (i>=j){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(i+" ");
                }

            }
            for (int j=n-1 ; j>=1 ; j--){
                if (i>=j){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(i+" ");
                }

            }
            System.out.println();
        }
        for (int i=n-1; i>=1 ; i--){
            for (int j=1 ; j<=n ; j++){
                if (i>=j){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(i+" ");
                }

            }
            for (int j=n-1 ; j>=1 ; j--){
                if (i>=j){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(i+" ");
                }

            }
            System.out.println();
        }
        
        sc.close();
    }

}

