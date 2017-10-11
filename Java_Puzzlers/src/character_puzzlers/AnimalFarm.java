package character_puzzlers;

public class AnimalFarm {

	public static void main(String[] args) {

		final String pig = "length: 10";
		System.out.println(pig.length());
		final String dog = "length: " + pig.length();
		final String cat = "length: 10";
		
		
		System.out.println("Animals are equal : " + pig == dog );
		System.out.println("Animals are equal : " + (pig == dog) );
		System.out.println("Animals are equal : " + pig.equals(dog) );
		
		System.out.println("Animals are equal : " + pig == cat );
		
		
		System.out.println(pig);
		System.out.println(dog);
	}

}
