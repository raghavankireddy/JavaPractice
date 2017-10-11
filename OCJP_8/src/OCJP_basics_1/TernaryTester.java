
package OCJP_basics_1;

public class TernaryTester {

	public static void main(String[] args) {
		// int x = 5;
		// System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
		//

		// for(int i=0; i<10 ; ) {
		// i = i++;
		// System.out.println("Hello World");
		// }
		//

		// int x1 = 5 * 4 % 3;
		// System.out.println(x1);
		//
		//
		// int x = 1, y = 15;
		// while x < 10
		// y––;
		// x++;
		// System.out.println(x+", "+y);

		// boolean keepGoing = true;
		// int result = 15, i = 10;
		// do {
		// i--;
		// if (i == 8)
		// keepGoing = false;
		// result -= 2;
		// } while (keepGoing);
		// System.out.println(result);

		final char a = 'A', d = 'D';
		char grade = 'B';
		switch (grade) {
		case a:
		case 'B':
			System.out.print("great");
		case 'C':
			System.out.print("good");
			break;
		case d:
		case 'F':
			System.out.print("not good");
		}

	}
}