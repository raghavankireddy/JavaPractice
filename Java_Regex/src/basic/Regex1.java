package basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {

		String s1 = "hellofdfdshellofdsfdshello";
		
		Pattern pattern = Pattern.compile("hello");
		
		Matcher matcher = pattern.matcher(s1);
		
		int occurences = 0;
		
		while(matcher.find()){
			occurences++;
		}
		
		System.out.println(occurences);
		
		
		
	}

}
