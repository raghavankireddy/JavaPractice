package pattern;

public class Pattern2 {

	public static void main(String[] args) {

		int range = 4;

		for (int i = 0; i < range; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
