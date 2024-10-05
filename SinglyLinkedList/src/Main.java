public class Main {
    public static void main(String[] args) {
        // Create an instance of SinglyLinkedList
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert elements at the head
        System.out.println("Inserting elements at head:");
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        printList(list);  // Expected output: 30 -> 20 -> 10

        // Insert elements at the tail
        System.out.println("Inserting elements at tail:");
        list.insertAtTail(40);
        list.insertAtTail(50);
        printList(list);  // Expected output: 30 -> 20 -> 10 -> 40 -> 50

        // Delete the head
        System.out.println("Deleting at head:");
        list.deleteAtHead();
        printList(list);  // Expected output: 20 -> 10 -> 40 -> 50

        // Delete the tail
        System.out.println("Deleting at tail:");
        list.deleteAtTail();
        printList(list);  // Expected output: 20 -> 10 -> 40

        // Reverse the list (traverse)
        System.out.println("Reversing the list:");
        list.reverseList();  // This method reverses the list
        printList(list);  // Expected output: 40 -> 10 -> 20

        // Check head and tail after reversing
        System.out.println("Current head: " + list.getHead().value);  // Expected output: 40
        System.out.println("Current tail: " + list.getTail().value);  // Expected output: 20

        System.out.println(list.searchValue(40));
        System.out.println(list.searchValue(69));
    }

    // Helper method to print the list
    public static void printList(SinglyLinkedList list) {
        Node current = list.getHead();
        while (current != null) {
            System.out.print(current.value + " ");
            if (current.nextValue != null) {
                System.out.print("-> ");
            }
            current = current.nextValue;
        }
        System.out.println();
    }
}
