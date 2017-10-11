package warmup_1;
/*
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten")  "kikittenki"
front22("Ha")  "HaHaHa"
front22("abc")  "ababcab"
 * */
public class front22_15 {

	static String testcase1="Republic"; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		front22_15 ob=new front22_15();
		String result=ob.front22(testcase1);
		System.out.println("Result Is-: "+result);
		
		boolean val=result.contains("Re");
		System.out.println(val);
		
		int index=result.indexOf('R');
		System.out.println(index);
		
		
	}

	public String front22(String str) {

		String firstTwoChar="";


		if( (str.equals("")) && (str.length()==0)  ){
		return "";
		}

		else if(str.length()<=1){
		String singleChar=str.substring(0,1);
		return singleChar+str+singleChar;
		}

		

		else{
		firstTwoChar=str.substring(0,2);
		return firstTwoChar+str+firstTwoChar;
		}  

		}
}
