package unit2;

public class ThisReferenceExampleUsingAnonymousInnerClass {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	interface Process {
		void process(int i);
	}

	public static void main(String[] args) {

		ThisReferenceExampleUsingAnonymousInnerClass ob = new ThisReferenceExampleUsingAnonymousInnerClass();

		ob.doProcess(90, new Process() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see unit2.ThisReferenceExample.Process#process(int) By Using
			 * anonymous Inner class we can use this reference inside the Static
			 * context, which is not allowed
			 */
			@Override
			public void process(int i) {
				System.out.println("Value of i Is : " + i);
				System.out.println(this);
			}

			public String toString() {
				return "This is Anonymous Inner Class Instance";
			}

		});
	}

}
