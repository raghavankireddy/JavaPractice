package oops_concepts;

public class Return_Type_Demo {

	// Example of Fun Overloading 
	void show (int x){
		x=10;
		System.out.println("Value of X :" + x);
	}
	
	// Return type doesn't play any role in F.Overloading in Java, For Prove - make the function name same, it will throw the error
	int show1(int y){
		y=5;
		System.out.println("Value of Y :" + y);
		return (y+6);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Return_Type_Demo ob=new Return_Type_Demo();
		
		ob.show(5);
		int z=ob.show1(0);
		System.out.println("Value of Z :" + z);

	}

}
