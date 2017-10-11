package basic;

public class Labelled_Break {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 3)
					break;
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
