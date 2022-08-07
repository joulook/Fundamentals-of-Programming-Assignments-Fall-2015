package Square;
import java.util.Scanner;


public class SquareInDiamund {

    
    public static void main(String[] args) {
       System.out.println("please enter an positive integer less than 150 :");
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       while(n<0){
           System.out.println("the number is incorrect !! . please enter an positive integer :");
           n=input.nextInt();
       }
       int k=2*n+1;
       int t,c;
       if(n%2==0){
           t=n/2+2;
           c=3*n/2;
       }
       else{
           t=n/2+2;
           c=3*(n/2)+2;
       }
       for(int i=1;i<=k;i++){
           for(int j=1;j<=k;j++){
               
               if(i<t || j<t || i>c || j>c){
                    if(i<=k/2){
                    if(j<=k/2){
                        if(i+j>k/2+1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    else if(j>k/2+1){
                        if(i>j-(k/2+1))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                else if(i>k/2+1){
                    if(j<=k/2){
                        if(i-(k/2+1)<j)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    else if(j>k/2+1){
                        if(i-(k/2+1)+j-(k/2+1)<=k/2)
                               System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                 if(i==k/2+1 || j==k/2+1)
                    System.out.print("*"); 
           }
               else
                   System.out.print(" ");
           // next row \n
       }
           System.out.println();
    }
    
    }
    
}
