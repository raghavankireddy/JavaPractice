package warmup_1;
/*
 * Given a string, if the string "del" appears starting at index 1, 
 * return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") : "abc"
delDel("adelHello") : "aHello"
delDel("adedbc") : "adedbc"
*
*/

public class DelDel_21 {

	static String testcase1= "adddd";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DelDel_21 ob=new DelDel_21();
		String result=ob.delDel(testcase1);
		System.out.println("Result Is : "+result);
		
	}

	public String delDel(String str) {
		  

	       if(str.length()>=4 && str.substring(1,4).equals("del")){
		      return ( str.substring(0,1) + str.substring(4) ); 
	       }
	      
	       else{
		       return str;
	       }
}

}
