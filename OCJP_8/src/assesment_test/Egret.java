package assesment_test;

public class Egret {

	private String color;
	
	public Egret(){
		this("white");
	}
	
	public Egret(String color){
		color=this.color;
	}
	
	public static void main(String[] args) {

		Egret obj =new Egret("Red");
		System.out.println("Color :" + obj.color);
		
	}

}
