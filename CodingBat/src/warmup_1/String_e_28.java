package warmup_1;

/*
 * Return true if the given string contains between 1 and 3 'e' chars.
stringE("Hello") : true
stringE("Heelle") : true
stringE("Heelele") : false
 * 
 * */
public class String_e_28 {

	static String testcase1="Heelele";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_e_28 ob=new String_e_28();
		boolean result=ob.stringE(testcase1);
		System.out.println("Result Is :"+result);
	}

	public boolean stringE(String str) {
		
		int count=0;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='e'){
				count++;
			}
		}
		 
		if(str.equals("")){
			return false;
		}
		
		else if(count>=1 && count<=3){
			return true;
		}
		
		else{
			return false;
		}
		
	}

}
