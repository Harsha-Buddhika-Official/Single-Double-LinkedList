package SLL;
public class SingleLinkedList {
	Node head;

	// insert a node in the beginning
	public void insertBegin(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// print the list
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		
		Node current = head;
		System.out.print("List: ");
		while (current != null) {
			System.out.print(current.data);
			if (current.next != null) {
				System.out.print(" -> ");
			}
			current = current.next;
		}
		System.out.println();
	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = newNode;
	}

	// insert after a specific node
	public void insertAfter(int targetData, int newData) {
		Node current = head;
		
		// Find the node with targetData
		while (current != null && current.data != targetData) {
			current = current.next;
		}
		
		// If targetData not found
		if (current == null) {
			System.out.println("Node with data " + targetData + " not found.");
			return;
		}
		
		// Create new node and insert after current
		Node newNode = new Node(newData);
		newNode.next = current.next;
		current.next = newNode;
	}

	// delete the first node
	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty. Cannot delete.");
			return;
		}
		
		head = head.next;
	}

	// delete the last node
	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty. Cannot delete.");
			return;
		}
		
		// If only one node
		if (head.next == null) {
			head = null;
			return;
		}
		
		// Find the second to last node
		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		
		// Remove the last node
		current.next = null;
	}

	// delete a specific node
	public void deleteNode(int data) {
		if (head == null) {
			System.out.println("List is empty. Cannot delete.");
			return;
		}
		
		// If head node is to be deleted
		if (head.data == data) {
			head = head.next;
			return;
		}
		
		// Find the node to delete
		Node current = head;
		while (current.next != null && current.next.data != data) {
			current = current.next;
		}
		
		// If node not found
		if (current.next == null) {
			System.out.println("Node with data " + data + " not found.");
			return;
		}
		
		// Delete the node
		current.next = current.next.next;
	}
	
	// Additional utility methods for better functionality
	
	// get the size of the list
	public int size() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	// check if list is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	// search for a specific value
	public boolean search(int data) {
		Node current = head;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	// get data at specific index
	public int get(int index) {
		if (index < 0) {
			throw new IndexOutOfBoundsException("Index cannot be negative");
		}
		
		Node current = head;
		int currentIndex = 0;
		
		while (current != null && currentIndex < index) {
			current = current.next;
			currentIndex++;
		}
		
		if (current == null) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		
		return current.data;
	}
}