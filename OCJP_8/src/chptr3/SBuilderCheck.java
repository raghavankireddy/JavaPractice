package chptr3;

public class SBuilderCheck {

	public static void main(String[] args) {

		StringBuilder a=new StringBuilder("abc");
		//StringBuilder b=a.append("de");
		StringBuilder c=new StringBuilder("abc");
		
		System.out.println("A With C");
		
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(a==c);
		System.out.println(a.toString().equals(c.toString()));
		System.out.println(a.equals(c));
		
		
		//b=b.append("f").append("g");
		
		System.out.println(a);
		//System.out.println(b);
		System.out.println("A with C" + "Equals");
		System.out.println(a.equals(c));
		
	}

}
