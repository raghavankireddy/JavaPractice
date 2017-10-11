package exception_Practice;

public class Demo {
	
	int div=0;

	public int Division(int a,int b)
	{
		try{
			div=a/b;
			
		}
		
		
		catch(Exception e){
			System.out.println(e.getMessage());
			System.exit(0);
			System.out.println("End Point");
		}
		
		
		
		finally{
			System.out.println("Finally Called");
		}
		
		return div;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Demo od=new Demo();
	int res=od.Division(10, 0);
	System.out.println(res);
	

	}

}
