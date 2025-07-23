package DLL;

public class MainDLL {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        
        // Test 1: Basic insertion at beginning and end
        System.out.println("1. Testing basic insertions:");
        dll.insertBegin(10);
        dll.insertBegin(20);
        dll.insertBegin(30);
        dll.insertEnd(40);
        dll.insertEnd(50);
        dll.printList();
        dll.printListReverse();
        System.out.println("Size: " + dll.size());
        
        // Test 2: Insert after and before specific nodes
        System.out.println("\n2. Testing insertAfter and insertBefore:");
        dll.insertAfter(20, 25);
        dll.insertBefore(40, 35);
        dll.printList();
        dll.printListReverse();
        
        // Test 3: Insert at specific index
        System.out.println("\n3. Testing insertAt:");
        dll.insertAt(0, 5);  // Insert at beginning
        dll.insertAt(dll.size(), 60);  // Insert at end
        dll.insertAt(4, 22);  // Insert in middle
        dll.printList();
        dll.printListReverse();
        
        // Test 4: Search and get operations
        System.out.println("\n4. Testing search and get operations:");
        System.out.println("Search for 25: " + dll.search(25));
        System.out.println("Search for 100: " + dll.search(100));
        System.out.println("Element at index 0: " + dll.get(0));
        System.out.println("Element at index 5: " + dll.get(5));
        System.out.println("First element: " + dll.getFirst());
        System.out.println("Last element: " + dll.getLast());
        
        // Test 5: Index operations
        System.out.println("\n5. Testing index operations:");
        System.out.println("Index of 25: " + dll.indexOf(25));
        System.out.println("Index of 100: " + dll.indexOf(100));
        dll.insertEnd(25);  // Add duplicate for testing lastIndexOf
        System.out.println("After adding duplicate 25:");
        dll.printList();
        System.out.println("First index of 25: " + dll.indexOf(25));
        System.out.println("Last index of 25: " + dll.lastIndexOf(25));
        
        // Test 6: Set operation
        System.out.println("\n6. Testing set operation:");
        System.out.println("Setting index 3 to 99:");
        dll.set(3, 99);
        dll.printList();
        
        // Test 7: Delete operations
        System.out.println("\n7. Testing delete operations:");
        System.out.println("Deleting first node:");
        dll.deleteFirst();
        dll.printList();
        
        System.out.println("Deleting last node:");
        dll.deleteLast();
        dll.printList();
        
        System.out.println("Deleting node with value 99:");
        dll.deleteNode(99);
        dll.printList();
        
        System.out.println("Deleting node at index 2:");
        dll.deleteAt(2);
        dll.printList();
        
        // Test 8: Array conversion
        System.out.println("\n8. Testing array conversion:");
        int[] array = dll.toArray();
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        // Test 9: Edge cases
        System.out.println("\n9. Testing edge cases:");
        System.out.println("Is empty: " + dll.isEmpty());
        
        // Clear the list
        dll.clear();
        System.out.println("After clearing:");
        dll.printList();
        System.out.println("Is empty: " + dll.isEmpty());
        System.out.println("Size: " + dll.size());
        
        // Test operations on empty list
        System.out.println("\n10. Testing operations on empty list:");
        dll.deleteFirst();
        dll.deleteNode(100);
        
        // Test single element operations
        System.out.println("\n11. Testing single element operations:");
        dll.insertBegin(42);
        dll.printList();
        dll.printListReverse();
        dll.deleteFirst();
        dll.printList();
        
        System.out.println("\nDemo completed successfully!");
    }
}
