
package Equations;

import java.util.Scanner;


public class EquSolver {


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("aX + bY = c");
        System.out.println("dX + eY = f");
        System.out.print("Input a : ");
        double a = cin.nextInt();
        System.out.print("Input b : ");
        double b = cin.nextInt();
        System.out.print("Input c : ");
        double c = cin.nextInt();
        System.out.print("Input d : ");
        double d = cin.nextInt();
        System.out.print("Input e : ");
        double e = cin.nextInt();
        System.out.print("Input f : ");
        double f = cin.nextInt();
        System.out.println(a+"X + "+b+"Y = "+c);
        System.out.println(d+"X + "+e+"Y = "+f);
        double delta = (a*e)-(b*d);
        double x = ((c*e)-(b*f))/delta;
        System.out.println("The X is : "+x);
        double y = ((a*f)-(c*d))/delta;
        System.out.println("The Y is : "+y);
        System.out.println("Developed by : JR.Y ");
        System.out.println("----->De.coder();");
    }
    
}
