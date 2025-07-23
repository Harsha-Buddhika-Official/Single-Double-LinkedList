# Single & Double Linked List Implementation in Java

A comprehensive implementation of **Single Linked List (SLL)** and **Doubly Linked List (DLL)** data structures in Java, featuring complete CRUD operations and utility methods.

## 📋 Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Features](#features)
- [Single Linked List (SLL)](#single-linked-list-sll)
- [Double Linked List (DLL)](#double-linked-list-dll)
- [Getting Started](#getting-started)
- [Usage Examples](#usage-examples)
- [Time Complexity](#time-complexity)
- [Contributing](#contributing)

## 🔍 Overview

This project provides robust implementations of two fundamental linear data structures:

- **Single Linked List**: A linear collection where each node points to the next node
- **Doubly Linked List**: A linear collection where each node has pointers to both next and previous nodes

Both implementations include comprehensive functionality for insertion, deletion, searching, and traversal operations.

## 📁 Project Structure

```
Single-Double-LinkedLIst/
├── SLL/                          # Single Linked List Implementation
│   ├── Node.java                 # Node class for SLL
│   ├── SingleLinkedList.java    # Main SLL class with operations
│   └── mainSLL.java             # Demo and test cases for SLL
├── DLL/                          # Double Linked List Implementation
│   ├── DoublyNode.java          # Node class for DLL
│   ├── DoubleLinkedList.java    # Main DLL class with operations
│   └── MainDLL.java             # Demo and test cases for DLL
└── README.md                    # Project documentation
```

## ✨ Features

### Common Features (Both SLL & DLL)
- ✅ Insert at beginning, end, and specific positions
- ✅ Delete from beginning, end, and specific nodes
- ✅ Search for elements
- ✅ Get element by index
- ✅ Size calculation
- ✅ Empty list checking
- ✅ Print list contents

### DLL Additional Features
- ✅ Bidirectional traversal (forward and reverse)
- ✅ Insert before specific nodes
- ✅ Get first and last elements
- ✅ Find index of elements (first and last occurrence)
- ✅ More efficient operations due to tail pointer

## 🔗 Single Linked List (SLL)

### Node Structure
```java
class Node {
    int data;
    Node next;
}
```

### Key Operations

| Operation | Method | Description |
|-----------|--------|-------------|
| Insert at Beginning | `insertBegin(int data)` | Adds element at the start |
| Insert at End | `insertEnd(int data)` | Adds element at the end |
| Insert After Node | `insertAfter(int target, int data)` | Inserts after specified value |
| Delete First | `deleteFirst()` | Removes first element |
| Delete Last | `deleteLast()` | Removes last element |
| Delete Specific | `deleteNode(int data)` | Removes specific element |
| Search | `search(int data)` | Returns true if element exists |
| Get by Index | `get(int index)` | Returns element at index |
| Size | `size()` | Returns number of elements |
| Is Empty | `isEmpty()` | Checks if list is empty |

### Example Usage
```java
SingleLinkedList sll = new SingleLinkedList();
sll.insertBegin(10);
sll.insertEnd(20);
sll.insertAfter(10, 15);
sll.printList(); // Output: List: 10 -> 15 -> 20
```

## 🔄 Double Linked List (DLL)

### Node Structure
```java
class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;
}
```

### Key Operations

| Operation | Method | Description |
|-----------|--------|-------------|
| Insert at Beginning | `insertBegin(int data)` | Adds element at the start |
| Insert at End | `insertEnd(int data)` | Adds element at the end |
| Insert After Node | `insertAfter(int target, int data)` | Inserts after specified value |
| Insert Before Node | `insertBefore(int target, int data)` | Inserts before specified value |
| Insert at Index | `insertAt(int index, int data)` | Inserts at specific position |
| Delete First | `deleteFirst()` | Removes first element |
| Delete Last | `deleteLast()` | Removes last element |
| Delete Specific | `deleteNode(int data)` | Removes specific element |
| Delete at Index | `deleteAt(int index)` | Removes element at index |
| Search | `search(int data)` | Returns true if element exists |
| Get by Index | `get(int index)` | Returns element at index |
| Get First | `getFirst()` | Returns first element |
| Get Last | `getLast()` | Returns last element |
| Index Of | `indexOf(int data)` | Returns first occurrence index |
| Last Index Of | `lastIndexOf(int data)` | Returns last occurrence index |
| Print Forward | `printList()` | Prints list from head to tail |
| Print Reverse | `printListReverse()` | Prints list from tail to head |

### Example Usage
```java
DoubleLinkedList dll = new DoubleLinkedList();
dll.insertBegin(10);
dll.insertEnd(30);
dll.insertAfter(10, 20);
dll.printList();        // Output: List: 10 <-> 20 <-> 30
dll.printListReverse(); // Output: Reverse: 30 <-> 20 <-> 10
```

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line

### Running the Project

1. **Clone the repository**
   ```bash
   git clone https://github.com/Harsha-Buddhika-Official/Single-Double-LinkedLIst.git
   cd Single-Double-LinkedLIst
   ```

2. **Compile and run Single Linked List demo**
   ```bash
   cd SLL
   javac *.java
   java mainSLL
   ```

3. **Compile and run Double Linked List demo**
   ```bash
   cd DLL
   javac *.java
   java MainDLL
   ```

## 💡 Usage Examples

### Single Linked List Demo Output
```
=== Single Linked List Implementation Demo ===

1. Inserting at beginning: 32, 26, 18, 10, 15
List: 32 -> 26 -> 18 -> 10 -> 15
List size: 5

2. Inserting at end: 1000
List: 32 -> 26 -> 18 -> 10 -> 15 -> 1000

3. Inserting 99 after node with value 18
List: 32 -> 26 -> 18 -> 99 -> 10 -> 15 -> 1000
```

### Double Linked List Demo Output
```
1. Testing basic insertions:
List: 30 <-> 20 <-> 10 <-> 40 <-> 50
Reverse: 50 <-> 40 <-> 10 <-> 20 <-> 30
Size: 5

2. Testing insertAfter and insertBefore:
List: 30 <-> 20 <-> 25 <-> 10 <-> 35 <-> 40 <-> 50
Reverse: 50 <-> 40 <-> 35 <-> 10 <-> 25 <-> 20 <-> 30
```

## ⏱️ Time Complexity

### Single Linked List
| Operation | Average Case | Worst Case |
|-----------|--------------|------------|
| Insert at Beginning | O(1) | O(1) |
| Insert at End | O(n) | O(n) |
| Insert After | O(n) | O(n) |
| Delete First | O(1) | O(1) |
| Delete Last | O(n) | O(n) |
| Delete Specific | O(n) | O(n) |
| Search | O(n) | O(n) |
| Access by Index | O(n) | O(n) |

### Double Linked List
| Operation | Average Case | Worst Case |
|-----------|--------------|------------|
| Insert at Beginning | O(1) | O(1) |
| Insert at End | O(1) | O(1) |
| Insert After/Before | O(n) | O(n) |
| Insert at Index | O(n) | O(n) |
| Delete First | O(1) | O(1) |
| Delete Last | O(1) | O(1) |
| Delete Specific | O(n) | O(n) |
| Search | O(n) | O(n) |
| Access by Index | O(n) | O(n) |

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

### How to Contribute
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👨‍💻 Author

**Harsha Buddhika**
- GitHub: [@Harsha-Buddhika-Official](https://github.com/Harsha-Buddhika-Official)

---

⭐ Star this repository if you find it helpful!
