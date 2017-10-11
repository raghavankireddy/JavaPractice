package OCJP_basics_1;

public class StringRiddle {

	public static void main(String[] args) {

		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);

		String start = "AniMaL";
		String trimmed = start.trim();

		// "AniMaL"Using the StringBuilder Class
		String lowercase = trimmed.toLowerCase();
		String result = lowercase.replace('a', 'A');
		System.out.println(result);

		String result1 = "AniMaL".trim().toLowerCase().replace('a', 'A');
		System.out.println(result1);
		
		System.out.println(result.substring(0, 4));
		System.out.println(result1.substring(0, 4));
		

	}

}
