package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod3_a {
	 WeakClass weakClass = new WeakClass();
	  
	 @Test
	    public void EX3_a_1(){
		 	int expected =5;
	        int result = WeakClass.WeakMethod3(5,1);
	        assertEquals(expected, result);
	    }
	   
	        
	   
	   }    
  
   

      


