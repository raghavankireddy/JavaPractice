package unit2;

import unit2.ThisReferenceExampleUsingAnonymousInnerClass.Process;

public class ThisReferenceExampleViaLambda {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	interface Process {
		void process(int i);
	}

	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i Is :" + i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisReferenceExampleViaLambda obl = new ThisReferenceExampleViaLambda();
		
		obl.execute();

	}
	
	public String toString(){
		return "This is example of Anonymous Inner Class Via Lambda";
	}

}
