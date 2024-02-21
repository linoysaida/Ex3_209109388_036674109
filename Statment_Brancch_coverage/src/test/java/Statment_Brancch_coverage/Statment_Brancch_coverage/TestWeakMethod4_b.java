package Statment_Brancch_coverage.Statment_Brancch_coverage;



import org.junit.Test;

public class TestWeakMethod4_b {

	 @Test(expected=java.lang.ArithmeticException.class)
	    public void EX4_b_1(){
		 	
	        WeakClass.WeakMethod4(5,0);
	       
	    }
}
