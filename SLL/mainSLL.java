package SLL;
class mainSLL {
    public static void main(String args[]) {
        SingleLinkedList SLL = new SingleLinkedList();
        
        System.out.println("=== Single Linked List Implementation Demo ===\n");
        
        // Test inserting at beginning
        System.out.println("1. Inserting at beginning: 32, 26, 18, 10, 15");
        SLL.insertBegin(15);
        SLL.insertBegin(10);
        SLL.insertBegin(18);
        SLL.insertBegin(26);
        SLL.insertBegin(32);
        SLL.printList();
        System.out.println("List size: " + SLL.size());
        
        // Test inserting at end
        System.out.println("\n2. Inserting at end: 1000");
        SLL.insertEnd(1000);
        SLL.printList();
        
        // Test inserting after a specific node
        System.out.println("\n3. Inserting 99 after node with value 18");
        SLL.insertAfter(18, 99);
        SLL.printList();
        
        // Test search functionality
        System.out.println("\n4. Searching for values:");
        System.out.println("Search for 26: " + SLL.search(26));
        System.out.println("Search for 500: " + SLL.search(500));
        
        // Test get by index
        System.out.println("\n5. Getting elements by index:");
        try {
            System.out.println("Element at index 0: " + SLL.get(0));
            System.out.println("Element at index 3: " + SLL.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Test delete operations
        System.out.println("\n6. Deleting first node:");
        SLL.deleteFirst();
        SLL.printList();
        
        System.out.println("\n7. Deleting last node:");
        SLL.deleteLast();
        SLL.printList();
        
        System.out.println("\n8. Deleting specific node (18):");
        SLL.deleteNode(18);
        SLL.printList();
        
        System.out.println("\n9. Trying to delete non-existent node (500):");
        SLL.deleteNode(500);
        
        System.out.println("\n10. Final list state:");
        SLL.printList();
        System.out.println("Final list size: " + SLL.size());
        System.out.println("Is list empty? " + SLL.isEmpty());
    }
}