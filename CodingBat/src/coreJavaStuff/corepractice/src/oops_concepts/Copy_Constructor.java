package oops_concepts;

public class Copy_Constructor {
	int x,y;
	

	public Copy_Constructor(int x,int y) {
		
		this.x=x;
		this.y=y;
		
	}

	public Copy_Constructor(Copy_Constructor z){
		this.x=z.x;
		this.y=z.y;
	}
	
	void show(){
		System.out.println("Value of x "  +x);
		System.out.println("Value of y "  +y);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Copy_Constructor c1=new Copy_Constructor(10,25);
		c1.show();
		
		
		Copy_Constructor c2=new Copy_Constructor(c1);
		System.out.println("Copied Values");
		c2.show();
		
	}

}
