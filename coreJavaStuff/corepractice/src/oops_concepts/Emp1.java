package oops_concepts;

public class Emp1 {

	// Static Memory Allocation of a class at the loading time of a class
	
	String name;
	int salary;
	String company_name="TCS";
	
	void get(String n1,int s1){
		
		name=n1;
		salary=s1;
		
	}
	
	void show(){
		
		System.out.println("Name is   :"+ name);
		System.out.println("Salary Is :" +salary);
		System.out.println("Company Is :" +company_name);
		
	}
	
	public static void main(String[] args) {
		
		// Anonymous Object
		new Emp1().get("lalala", 1515);
		
		// Only while using "new" keyword, there is a object creation, without "new" there is no object creation exist
		Emp1 ob=new Emp1();
		
		ob.get("Lalu", 5000);
		
		// Assigning a reference of older ref-var to new ref-var 
		Emp1 ob1=ob;
		
		// Now it will override the previous value 
		ob1.name="Lalu Prasad";
		
		ob.show();
		
		
	}

}
