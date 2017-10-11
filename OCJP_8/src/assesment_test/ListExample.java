package assesment_test;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		int[] arr = {6,9,8};
		
		List<Integer> list = new ArrayList<>();
		
		list.add(arr[0]);
		list.add(arr[2]);
		System.out.println(list);
		System.out.println(list.size());
		list.set(1, arr[1]);
		
		list.remove(0);
		System.out.println(list);
		
		
		
	}

}
