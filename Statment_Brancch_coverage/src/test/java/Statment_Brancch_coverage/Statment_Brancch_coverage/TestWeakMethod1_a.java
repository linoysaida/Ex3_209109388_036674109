package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class TestWeakMethod1_a {
	
	
	@Test(expected=java.lang.ArithmeticException.class)
		public void EX1_b(){
		 
	        int x = 0;
	        int y = 5;
	        WeakClass.WeakMethod1(x, y);
	    
	        
	    }
}
