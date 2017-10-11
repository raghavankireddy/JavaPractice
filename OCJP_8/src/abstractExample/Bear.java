package abstractExample;

public class Bear  implements Herbivore,Ominvore{

	@Override
	public void eatMeat() {
		System.out.println("MEAT");
	}

	@Override
	public void eatPlants() {
		System.out.println("PLANTS");
	}

	public static void main(String args[]){
		
		Bear b = new Bear();
		b.eatMeat();
		b.eatPlants();
		b.eatPlants(3);
		double g = b.getTemperature();
		System.out.println(g);
	}

	@Override
	public void eatPlants(int eat) {
		System.out.println("DFDSFS");
	}

	
	
}
