package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod4_a {
	 
	  
	 @Test
	    public void EX4_a_1(){
		 	int expected =1;
	        int result = WeakClass.WeakMethod4(4,1);
	        assertEquals(expected, result);
	    }
	   
	        
	 @Test
	    public void EX4_a_2(){
		 	int expected =0;
	        int result = WeakClass.WeakMethod4(0,-1);
	        assertEquals(expected, result);
	    }
	 
	 @Test
	    public void EX4_a_3(){
		 	int expected =-4;
	        int result = WeakClass.WeakMethod4(-4,1);
	        assertEquals(expected, result);
	    }
	    
	   
	       
  
}
