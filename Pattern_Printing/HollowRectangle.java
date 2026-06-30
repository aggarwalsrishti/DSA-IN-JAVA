package Pattern_Printing;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NO OF COLUMNS:");
        int x= sc.nextInt();
        System.out.print("ENTER NO OF ROWS:");
        int y=sc.nextInt();
        for (int i=1 ; i<=y ; i++){
            for (int j=1; j<=x; j++){
                if (i==1 || j==1 || i==y || j==x){
                    System.out.print("* ");
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
