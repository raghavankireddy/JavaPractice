
public class DryRun {

	public DryRun() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		DryRun d=new DryRun();
		String s=d.fn3("the#fat#cat");
		System.out.println("Last Value of StrMid :" + s);
		
		String s1=d.fn4("TheFatCat");
		System.out.println("Last Value of StrMid :" + s1);
		
		//boolean check=d.fn2("India");
		
		
	}
	
	public String fn0(){
		String str1 = "Hello ";
		String str2 = "World";
		String str3  = str1 + " " + str2;
		System.out.println(str3);
		int len = str1.length();
		System.out.println(len);
		char ch = str1.charAt(2);
		System.out.println(ch);
		return str3;
	}
	
	
	public String fn1(String str){
		
		int len = str.length();
		for (int i=0;i<len;i++){
			char ch = str.charAt(i);
			System.out.println(ch);
		}
		return str;
	}

	
	public boolean fn2(String str){
		int len = str.length();
		String strNew = "";
		String strNew1 = "";
		for (int i=0;i<len;i++){
			char ch = str.charAt(i);
			System.out.println(ch);
			strNew = strNew + ' '+ch;
			strNew1 = strNew1 + ch;
		}		
		System.out.println(strNew);
		System.out.println(str.equals(strNew1));
		return false;
	}
	
	
	//the#fat#cat is a arguement
	
	public String fn3(String str){
		int len = str.length();
		String strMid = "";
		int count = 0;
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if (ch=='#'){
				System.out.println(strMid);		
				if (count==1)
					return strMid;
				count++;
				strMid = "";
			}				
			else
				strMid = strMid+ch;
		}
		System.out.println(strMid);		
		return strMid;
	}
	
	//TheFatCat is the arguement
	
	public String fn4(String str){
		int len = str.length();
		String strMid = "";
		int count = 0;
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			strMid = strMid+ch;
			i = i+2;
		}
		System.out.println(strMid);		
		return strMid;
	}

}
