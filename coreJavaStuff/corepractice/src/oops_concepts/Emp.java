package oops_concepts;

public class Emp {

	String name;
	int salary;
	
	void get(String n1,int s1){
		
		name=n1;
		salary=s1;
		
	}
	
	void show(){
		
		System.out.println("Name is   :"+ name);
		System.out.println("Salary Is :" +salary);
		
	}
	
	public static void main(String[] args) {
		
		
		// Anonymous Object
		new Emp().get("lalala", 1515);
		new Emp().show();
		
		Emp ob=new Emp();
		
		ob.get("Lalu", 5000);
		
		// Assigning a reference of older ref-var to new ref-var 
		Emp ob1=ob;
		
		// Now it will override the previous value 
		ob1.name="Lalu Prasad";
		
		System.out.println();
		ob1.show();
		
		// If there are same values , so it means there is only one object 
		System.out.println("Value of Reference Variable " + ob);
		System.out.println("Value of Reference Variable " + ob1);
		
	}

}
