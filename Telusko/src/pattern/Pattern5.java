package pattern;

public class Pattern5 {

	public static void main(String[] args) {

		int i,j;
		
		for (int j2 = 1; j2 <= 5; j2++) {
			for (int k = 1; k <=j2; k++) {
				System.out.print((j2+k+1)%2);
			}
			System.out.println();
		}
	}

}
