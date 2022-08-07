package testing;
import java.util.*;

public class ComputePi {

	public static void main(String[] args) {
		 int i;                                                               
	   	 int squre = 0;                                             
	   	 int circle = 0;                                            
	   	 double x, y;                                                 
	   	 Random random = new Random();
	   	 for (i = 0; i < 1000000000; i++)                         
	   	 {  
	   		int signX =  random.nextInt();
	   		int signY =  random.nextInt();
	   		if(signX>=0 && signY>=0){ 
	   			x = Math.random();                
	   	    	y = Math.random();                                                
	   	    }else if(signX<0 && signY>=0) {
	   	    	x = Math.random()*-1;                
		   	    y = Math.random();
	   	    }else if(signX >=0 && signY<0) {
	   	    	x = Math.random();                
		   	    y = Math.random()*-1;
	   	    }else{
	   	    	x = Math.random()*-1;                
		   	    y = Math.random()*-1;
	   	    }
	   	    squre++;                                                        
	   									
	   	    if ( x*x + y*y <= 1 )             
	   	       circle++;                                               
	   	 }                                                            
	   	 System.out.println("Pi = " + 4*(double)circle/(double)squre );

	}

}
