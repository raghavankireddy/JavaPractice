package chapter7;

import java.util.ArrayList;

public class ArrayList_Program {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		myList.add(47);
		myList.add(162);
		myList.add(-12);
		myList.add(63);
		myList.add(8);
		myList.add(2);
		myList.add(110);
		myList.add(14);
		
		
		System.out.println("Initial Array " + myList);
		
		// Replacing the 4th element, since index begin from 0, so the 4th element will be at 3rd place.
		myList.add(3, 99);
		myList.remove(4);
		
		//Replacing 4th element with 99
		System.out.println("Updated List " + myList);
		
		//Copying the first element value with last element
		myList.add(7, 47);
		myList.remove(8);
		System.out.println("Updated List " + myList);
		
		//Incrementing the 7th element with 20
		myList.add(6, 130);
		myList.remove(7);
		System.out.println("Updated List " + myList);
		
	}

}
