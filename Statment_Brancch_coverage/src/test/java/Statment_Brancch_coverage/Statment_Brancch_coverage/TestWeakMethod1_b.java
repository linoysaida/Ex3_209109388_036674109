package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod1_b
{
	
	 @Test
		public void EX1_b_1(){
		 
	        int x = 1;
	        int y = 5;
	        
	        int expected =6;
	        int result = WeakClass.WeakMethod1(x, y);
	        assertEquals(expected, result);
	        
	    }
	 @Test
		public void EX1_b_2(){
		 
	        int x = -1;
	        int y = 5;
	        
	        int expected =-9;
	        int result = WeakClass.WeakMethod1(x, y);
	        assertEquals(expected, result);
	        
	    }


}