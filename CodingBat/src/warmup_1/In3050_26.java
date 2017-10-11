package warmup_1;

/*
 * Given 2 int values, 
 * return true if they are both in the range 30..40 inclusive, 
 * or they are both in the range 40..50 inclusive.

in3050(30, 31) : true
in3050(30, 41) : false
in3050(40, 50) : true
 * */
public class In3050_26 {

	static int testcase1=50;
	static int testcase2=39;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		In3050_26 ob=new In3050_26();
		boolean result =ob.in3050(testcase1, testcase2);
		System.out.println("Result Is :"+result);
	}

	public boolean in3050(int a, int b) {

int diffn1=0,diffn2=0;
		  
  		
  		if(a<30 && b>50){
  			return false;
  		}
  		 
  		 else if((a>=30 && a<=40) && (b>=30 && b<=40) ){
			  diffn1=b-a;
		    if(diffn1<=10){
		    	return true;
		    	}    
		    	else{
		    		return false;
		    	}
		  }
  		
  		 else if( (a>=40 && a<=50) && (b>=40 && b<=50) ){
			  diffn2=b-a;
		    if(diffn2<=10){
		    	return true;
		    	}    
		    	else{
		    		return false;
		    	}
		  }
 		
  		 else{
  			 return false;
  		 } 
	}
	
}	