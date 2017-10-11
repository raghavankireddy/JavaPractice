package OCJP_basics_1;

public class StringBasics {
	
    static int count=0;
    static int count1=0;
    

	public static void main(String[] args) {

		String value = "animals";

		System.out.println(value.indexOf('a'));

		System.out.println(value.indexOf("al"));

		System.out.println(value.indexOf("al", 5));

		System.out.println(value.substring(1, 3));

		String result = "AniMaL".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);

		System.out.println("abcabc".replace("a", "A"));
		System.out.println("abcabc".replace('a', 'A'));

		String a = "abc";
		String b = a.toUpperCase();

		System.out.println(a);
		System.out.println(b);

		b = b.replace("B", "2").replace('C', '3');
		System.out.println(b);

		System.out.println(a);
		System.out.println(b);

		String alpha = "";
		for (char current = 'a'; current <= 'z'; current++)
		{	alpha += current;
		count++;
		}
		System.out.println("Value  : " + count);
		
		System.out.println(alpha);

		StringBuilder alpha1 = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
		{	alpha1.append(current);
		count1++;
		}

		System.out.println("Value  : " + count1);
		
		System.out.println(alpha1);

	}

}
