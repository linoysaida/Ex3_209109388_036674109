package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	
	
	
	public static int WeakMethod1(int x,int y){
		int result=0;
		
		if( x<=0 || y<0) {
			result=(y+4)/x;		
		}
		
		else {
			result=y+x;
		}
		
		return result;
		
	}
	
	
	
	
	public static int WeakMethod2(int x,int y) {
		int result=0;
		
		if( x<0 || y==0) {
			result=x/y;		
		}
		
		else {
			result=y*x;
		}
		
		return result;
			
	}
	
	
	
	
	
	public static int WeakMethod3(int x, int y) {
		int result;
        if (x > 0) {
            result = x ;
        }
        if(x==5) {
        	result=5;
        }
        result = x/y;
      return result;}
      
	
	
	
	
	
	public static int WeakMethod4(int x, int y) {
		int result=0;
		
		if( x!=0 || y==0) {
			result=x/y;		
		}
		else {
			return y;
		}
		
		return result;
			
	}
	

}
	
