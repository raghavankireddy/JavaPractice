package arrayList;

import java.util.*; 

public class ArrayListToArray {

	public static void main(String[] args) {

		String[] array = { "hawk", "robin" };

		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		System.out.println(list);
		
		list.set(1, "Test");
		list.set(0, "Element");
		
		System.out.println(list);
		
		//list.remove(1);
		Collections.sort(list);
		System.out.println("Sorted List :" +list);
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(44);
		listInt.add(98);
		listInt.add(144);
		listInt.add(4);
		
		Collections.sort(listInt);

		
		System.out.println("Sorted Integer : " + listInt);
	}
	

}
