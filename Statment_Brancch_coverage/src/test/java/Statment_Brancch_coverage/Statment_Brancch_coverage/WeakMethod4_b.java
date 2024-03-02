package Statment_Brancch_coverage.Statment_Brancch_coverage;



import org.junit.Test;

public class WeakMethod4_b {

 @Test(expected=java.lang.ArithmeticException.class)
	    public void EX4_b(){
		 	
	        WeakClass.WeakMethod4(5,0);
	       
	    }
}