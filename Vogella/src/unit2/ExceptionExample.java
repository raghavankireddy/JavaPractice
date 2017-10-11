package unit2;

import java.util.Iterator;
import java.util.function.BiConsumer;

public class ExceptionExample {

	public static void main(String[] args) {

		int[] somenumbers = { 1, 2, 3, 4 };
		int key = 0;

		process(somenumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] somenumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : somenumbers) {
			consumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception Caught In Wrapper Lambda");
			}
		};
	}
}
