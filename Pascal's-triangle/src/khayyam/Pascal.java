
package Pascal;

import java.util.Scanner;


public class Pascal {

    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int row=cin.nextInt();
        for(int i=1 ; i<=row ; i++){
            for(int j=0 ; j<=i ; j++){
                print(combination(i-1, j));
            }
            System.out.println();
        }
        System.out.println("Developed by : Mohammad H. Khoshechin");
        
    }
    //********************************************************
    public static long combination(int x , int y){
        if( x>=y && x>=0){
            long factorialX = 1;
            long factorialY = 1;
            long factorialX_Y = 1;
            int i=1;
            while(i<=x){
                factorialX=i*factorialX;
                i++;
            }
            i=1;
            while(i<=y){
                factorialY=i*factorialY;
                i++;
            }
            i=1;
            while(i<=x-y){
                factorialX_Y=i*factorialX_Y;
                i++;
              }
            long result = factorialX / (factorialX_Y * factorialY);
            return result;
        }else{
            return 0;
        }
    }
    //********************************************************
    public static void print (long number){
        long x = number;
        int c = 1;
        if(number!=0){
            while(x/10!=0){
                c++;
                x=x/10;
            }
            if(c==1)
                System.out.print(number+"     ");
         else   if(c==2)
                System.out.print(number+"    ");
         else   if(c==3)
                System.out.print(number+"   ");
         else   if(c==4)
                System.out.print(number+"  ");
         else   if(c==5)
                System.out.print(number+" ");
         else   if(c==6)
                System.out.print(number);
         else
                System.out.print(number);
        }
    }
    
}
