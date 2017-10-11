package pattern;

public class Pattern4 {

	public static void main(String[] args) {

	int range =4;
		
		for (int i = 1; i <=range; i++) {
			for (int j = i; j <=range; j++) {
				System.out.print(j);
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k);
			}
			System.out.println(" ");
		}
	}
	
}
