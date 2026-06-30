package Pattern_Printing;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO OF ROWS:");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n ; j++){
                if (i+j<=n){
                System.out.print("  ");}
            }
            for (int k=1 ; k<= 2*i -1 ; k++){
                System.out.print("* ");
            }
            
            
            System.out.println();
            
        }
        for (int m=1 ; m<=n-1 ; m++){
                for(int q=1 ; q<=m ; q++){
                    System.out.print("  ");
                }
                for(int p=1 ; p<=(2*(n-m))-1; p++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        sc.close();
    }
}
