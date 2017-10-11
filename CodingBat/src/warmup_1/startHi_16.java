package warmup_1;

public class startHi_16 {

	static String testcase1="hi there";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		startHi_16 ob=new startHi_16();
		boolean result=ob.startHi(testcase1);
		System.out.println("Result Is -: " + result);
	}
	
	public boolean startHi(String str) {

		if(str.indexOf('h')==0 && str.indexOf('i')==1)
		{
		return true;
		}

		else{
		return false;
		}
		  
		}

}
