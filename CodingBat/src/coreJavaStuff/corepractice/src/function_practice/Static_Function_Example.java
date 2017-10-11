package function_practice;

class Basebase{
	// if function is static void show, then you cannot override it, both must be static in n nature
	// one is non-static or other is static, then it wonlt work
	
	/*
	 * When ever a parent and class are both having a same static function , then this concept is known as function hiding
	 * Static things are never used with obj, bcoz dynamic binding is used with obj
	 */
	
	
	
	
	static void show(){
		System.out.println("Base");
	}
}


public class Static_Function_Example extends Basebase{

	static void show(){
		System.out.println("Child");
		//super.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// No need for object creation, if the method is static
		
		//Static_Function_Example sfe=new Static_Function_Example();
		show();
	}

}
