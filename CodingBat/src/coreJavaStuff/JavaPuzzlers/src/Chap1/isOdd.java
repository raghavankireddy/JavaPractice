package Chap1;

public class isOdd {

	public static void main(String[] args) {
	
		boolean b=false;
		
		
		b=OddCheck(5);
		System.out.println(b);
		
		b=OddCheckBitwise(7);
		System.out.println(b);
		
	}

	public static boolean OddCheck(int i){
		return i%2!=0;
	}

	public static boolean OddCheckBitwise(int i){
		return (i&1)!=0;
	}
}
