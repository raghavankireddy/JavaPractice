package warmup_1;

/*
 * Given 2 positive int values, 
 * return the larger value that is in the range 10..20 inclusive, 
 * or return 0 if neither is in that range.

max1020(11, 19) : 19
max1020(19, 11) : 19
max1020(11, 9) : 11
 * */

public class Max1020_27 {

	static int testcase1=21;
	static int testcase2=10;
	
	public static void main(String[] args) {

		Max1020_27 ob=new Max1020_27();
		int result=ob.max1020(testcase1, testcase2);
		System.out.println("Result Is :"+ result);
	}
	
	public int max1020(int a, int b) {

		  
  		if(b>a){
                  int temp=a;
                  a=b;
                  b=temp;
                }
  		
  			if(a>=10 && a<=20){
  				return a;
  			}
  				else if(b>=10 && b<=20){
  					return b;
  				}
  					else{
  						return 0;
  					}		
   
  		
	}
}
