package linkedList;

public class LinkedList {

	// head of List
	static Node head;

	/*
	 * Linked list Node. This inner class is made static so that main() can
	 * access it
	 */
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* method to create a simple linked list with 3 nodes */
	public static void main(String[] args) {

		/*
		 * Start with empty List
		 */

		LinkedList list = new LinkedList();

		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		/*
		 * Three nodes have been allocated dynamically. We have references to
		 * these three blocks as first, second and third
		 * 
		 * list.head second third | | | | | | +----+------+ +----+------+
		 * +----+------+ | 1 | null | | 2 | null | | 3 | null | +----+------+
		 * +----+------+ +----+------+
		 */

		// Link first node with the second node
		list.head.next = second;

		/*
		 * Now next of first Node refers to second. So they both are linked.
		 * 
		 * list.head second third | | | | | | +----+------+ +----+------+
		 * +----+------+ | 1 | o-------->| 2 | null | | 3 | null | +----+------+
		 * +----+------+ +----+------+
		 */

		// Link second node with the third node
		second.next = third;

		/*
		 * Now next of second Node refers to third. So all three nodes are
		 * linked.
		 * 
		 * llist.head second third | | | | | | +----+------+ +----+------+
		 * +----+------+ | 1 | o-------->| 2 | o-------->| 3 | null |
		 * +----+------+ +----+------+ +----+------+
		 */

		int count = list.ListLength(head);
		System.out.println("The count of Values in Linked List : " + count);

	}

	/*
	 * The ListLength() function takes a Linked List as an input and counts the
	 * number of nodes in the list. The function given below can be used for
	 * printing the list data with extra print function.
	 */
	public int ListLength(Node headNode) {

		int length = 0;
		Node currentNode = headNode;
		while (currentNode != null) {

			System.out.println(currentNode.toString());
			System.out.println("Values " + currentNode.data);
			length++;
			currentNode = currentNode.next;

		}
		return length;
	}

}
