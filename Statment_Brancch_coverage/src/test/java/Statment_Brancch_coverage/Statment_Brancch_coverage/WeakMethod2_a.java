package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class WeakMethod2_a{

	@Test(expected=java.lang.ArithmeticException.class)
		public void EX2_a(){
		 
	        int x = 8;
	        int y = 0;
	        
	
	       WeakClass.WeakMethod2(x, y);
	       
	        
	    }

}
