package linkedList;

public class InsertionOperation {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {

		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	public void insertAfter(Node prev_node, int new_data) {
		/* 1. Check if the given Node is null */
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		/*
		 * 2 & 3: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 4. Make next of new Node as next of prev_node */
		new_node.next = prev_node.next;

		/* 5. make next of prev_node as new_node */
		prev_node.next = new_node;
	}

	public void append(int new_data) {

		int count = 0;
		Node new_node = new Node(new_data);

		if (head == null) {
			head = new Node(new_data);
			new_node.next = null;
		}

		else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
				count++;
			}
			last.next = new_node;

			System.out.println("Count : " + count);
		}
		return;

	}

	public void printList(Node headNode) {
		Node tnode = headNode;
		while (tnode != null) {
			System.out.println(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	/*
	 * Driver program to test above functions. Ideally this function should be
	 * in a separate user class. It is kept here to keep code compact
	 */
	public static void main(String[] args) {

		InsertionOperation list = new InsertionOperation();

		// list.append(12);

		list.push(1);

		list.push(7);

		list.push(5);

		list.append(4);

		// list.append(9);

		list.insertAfter(InsertionOperation.head.next, 8);

		System.out.println("\nCreated Linked list is: ");

		list.printList(head);
	}

}
