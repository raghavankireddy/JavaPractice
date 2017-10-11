package oops_concepts;

class Child_Data_Hiding extends Data_Hiding{

	int x=40;
	
	void show(){
		
		
		System.out.println("Value from a Child Class "+x);
		System.out.println("Value from a Base Class "+ super.x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child_Data_Hiding ob=new Child_Data_Hiding();
		
		// Accessing Child Class Level Variable
		ob.show();
		
		System.out.println("Value from the Base Class In Other Way " + ((Data_Hiding)ob).x);
		
		
		/*
		 * In this, even though the variable ob refers an instance of class Child, the od.x still evaluates to "Base". 
		 * Because variables names in Java are resolved by the reference type, not the object they are referencing.

		 *  In this example, even though both ob and od are referencing the object of type Child, 
		 *  ob is declared as type Child, od is declared as type Base, 
		 *  Java runtime gets the ob.x from the class of Sub, 
		 *  and od.x from the class of Base. 
		 */
		
		
		Data_Hiding od=ob;
		
		
		System.out.println("Value accessing via data memeber " + od.x);
		
		
		
		
		
		
	}

}
