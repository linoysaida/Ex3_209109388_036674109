package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod2_b{

	
	 @Test
		public void EX2_b_1(){
		 
	        int x = 1;
	        int y = 5;
	        
	        int expected =5;
	        int result = WeakClass.WeakMethod2(x, y);
	        assertEquals(expected, result);
	        
	    }
	 @Test
		public void EX2_b_2(){
		 
	        int x = -1;
	        int y = 5;
	        
	        int expected =-1/5;
	        int result = WeakClass.WeakMethod2(x, y);
	        assertEquals(expected, result);
	        
	    }

}
