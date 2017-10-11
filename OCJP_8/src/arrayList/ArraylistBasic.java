package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArraylistBasic {

	public static void main(String[] args) {

		List<String> list = new ArrayList();

		list.add("Kohima");
		list.add("Kohima");

		list.add("Guwahati");
		list.add(0, "Shillong");

		list.add(1, "Dzukou");
		list.add(0, "Mawlynnong");
		list.add(1, "Mawlynnong");

		System.out.println(list);

		list.stream().filter(s -> s.contains("Kohima")).forEach(System.out::println);

		
		Object[] objArray = list.toArray();
		System.out.println(objArray.length);
		
		String[] strArray = list.toArray(new String[0]);
		System.out.println(strArray.length);
		
		
		List<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);

		// list1.remove(1);
		list1.remove(new Integer(2));

		System.out.println(list1);

	}

}
