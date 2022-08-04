
package Binary;

import java.util.Scanner;


public class BiCal {

  
    public static void main(String[] args) {
        System.out.println("Part A ");
        System.out.print("Enter Your Binary Number : ");
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        A(x);
        System.out.println("Part B ");
        System.out.print("Enter Your Number : ");
        int y = cin.nextInt();
        B(y);
        System.out.println("Part C ");
        System.out.print("Enter Your First Binary Number : ");
        int z1 = cin.nextInt();
        System.out.print("Enter Your Second Binary Number : ");
        int z2 = cin.nextInt();
        C(z1,z2);
        WhoBuildThis();
    }
    public static void A(int x){
        int r = 0;
        int sum = 0 ;
        for(int i=1 ;x>0 ; i=i*2){
            r = x%10;
            sum = sum + (r*i);
            x=x/10;
        }
        System.out.println("Your Number is : "+sum+"\n");
    }
    public static void B(int y){
        int a = 1;
        while(a<=y){
            a=a*2;
        }
        a = a/2;
        while(a>0){
            if(y>=a){
                y = y - a ;
                System.out.print(1);        
            } else {
                System.out.print(0);
            }
            a = a/2;
        }
        System.out.println("\n");
    }
    public static void C(int z1 , int z2){
        int k1 =z1;
        int k2 =z2;
        int c1=0;
        while(k1>0){
            k1=k1/10;
            c1++;
        }
        int c2=0;
        while(k2>0){
            k2=k2/10;
            c2++;
        }
        int c=0;
        if(c1>=c2)
            c=c1;
        else
            c=c2;
        
        int []t1 = new int [c];
        int []t2 = new int [c];
        
        int r=0;
        for(int i=0 ; i<t1.length;i++){
            r=z1%10;
            t1[t1.length-1-i] = r;
            z1 = z1/10;
        }
        r=0;
        for(int i=0 ; i<t2.length;i++){
            r=z2%10;
            t2[t2.length-1-i] = r;
            z2 = z2/10;
        }
        int []t3 = new int[c+1];
        int []t4 = new int[c+1];
        for(int i=0 ; i<c ; i++){
            if(t1[c-1-i] + t2[c-1-i] + t4[c-i] == 1)
                t3[c-i] = 1;
            if(t1[c-1-i] + t2[c-1-i] + t4[c-i] == 2)
                t4[c-i-1] = 1;
            if(t1[c-1-i] + t2[c-1-i] + t4[c-i] == 3){
                t3[c-i] = 1;
                t4[c-i-1] = 1;
            }
        }
        t3[0]=t4[0];
        System.out.print("The Sum of these two binary Numbers is : ");
        for(int i=0 ; i<c+1 ; i++)
            System.out.print(t3[i]);
        System.out.println();
    }
    public static void WhoBuildThis(){
        System.out.println("\nDeveloped By : JR.Y\n------->De.coder();");
    }
}
