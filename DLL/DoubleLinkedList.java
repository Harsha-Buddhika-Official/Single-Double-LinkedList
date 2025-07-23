package DLL;

public class DoubleLinkedList {
    DoublyNode head;
    DoublyNode tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insert a node at the beginning
    public void insertBegin(int data) {
        DoublyNode newNode = new DoublyNode(data);
        
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Insert a node at the end
    public void insertEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);
        
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Insert after a specific node
    public void insertAfter(int targetData, int newData) {
        DoublyNode current = head;
        
        // Find the node with targetData
        while (current != null && current.data != targetData) {
            current = current.next;
        }
        
        // If targetData not found
        if (current == null) {
            System.out.println("Node with data " + targetData + " not found.");
            return;
        }
        
        DoublyNode newNode = new DoublyNode(newData);
        newNode.next = current.next;
        newNode.prev = current;
        
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            // If inserting after the tail
            tail = newNode;
        }
        
        current.next = newNode;
        size++;
    }

    // Insert before a specific node
    public void insertBefore(int targetData, int newData) {
        DoublyNode current = head;
        
        // Find the node with targetData
        while (current != null && current.data != targetData) {
            current = current.next;
        }
        
        // If targetData not found
        if (current == null) {
            System.out.println("Node with data " + targetData + " not found.");
            return;
        }
        
        DoublyNode newNode = new DoublyNode(newData);
        newNode.next = current;
        newNode.prev = current.prev;
        
        if (current.prev != null) {
            current.prev.next = newNode;
        } else {
            // If inserting before the head
            head = newNode;
        }
        
        current.prev = newNode;
        size++;
    }

    // Insert at a specific index
    public void insertAt(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        if (index == 0) {
            insertBegin(data);
            return;
        }
        
        if (index == size) {
            insertEnd(data);
            return;
        }
        
        DoublyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        DoublyNode newNode = new DoublyNode(data);
        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
    }

    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        
        if (head == tail) {
            // Only one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        
        if (head == tail) {
            // Only one node
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    // Delete a specific node by value
    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        
        DoublyNode current = head;
        
        // Find the node to delete
        while (current != null && current.data != data) {
            current = current.next;
        }
        
        // If node not found
        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }
        
        // If it's the only node
        if (current == head && current == tail) {
            head = tail = null;
        }
        // If it's the head node
        else if (current == head) {
            head = head.next;
            head.prev = null;
        }
        // If it's the tail node
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        // If it's a middle node
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        
        size--;
    }

    // Delete node at specific index
    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        if (index == 0) {
            deleteFirst();
            return;
        }
        
        if (index == size - 1) {
            deleteLast();
            return;
        }
        
        DoublyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    // Print the list from beginning to end
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        DoublyNode current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Print the list from end to beginning
    public void printListReverse() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        
        DoublyNode current = tail;
        System.out.print("Reverse: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.prev != null) {
                System.out.print(" <-> ");
            }
            current = current.prev;
        }
        System.out.println();
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Search for a specific value
    public boolean search(int data) {
        DoublyNode current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Get data at specific index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        DoublyNode current;
        
        // Optimize by starting from head or tail depending on index
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        
        return current.data;
    }

    // Set data at specific index
    public void set(int index, int data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        DoublyNode current;
        
        // Optimize by starting from head or tail depending on index
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        
        current.data = data;
    }

    // Get the first element
    public int getFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        return head.data;
    }

    // Get the last element
    public int getLast() {
        if (tail == null) {
            throw new RuntimeException("List is empty");
        }
        return tail.data;
    }

    // Clear the entire list
    public void clear() {
        head = tail = null;
        size = 0;
    }

    // Convert list to array
    public int[] toArray() {
        int[] array = new int[size];
        DoublyNode current = head;
        int index = 0;
        
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        
        return array;
    }

    // Find index of first occurrence of data
    public int indexOf(int data) {
        DoublyNode current = head;
        int index = 0;
        
        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        
        return -1; // Not found
    }

    // Find index of last occurrence of data
    public int lastIndexOf(int data) {
        DoublyNode current = tail;
        int index = size - 1;
        
        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.prev;
            index--;
        }
        
        return -1; // Not found
    }
}
