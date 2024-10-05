public class SinglyLinkedList {
    private Node head = null;
    private Node tail = null;

    public void insertAtHead(int valueIn){ // Time complexity O(1) since size of the list does not matter here
        Node newNode = new Node(valueIn);

        if(head == null){
            //therefore it is still empty
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.nextValue = head;
        head = newNode;
    }

    public void insertAtTail(int valueIn){ // Time complexity O(1) since size of the list does not matter here
        Node newNode = new Node(valueIn);

        if(head == null){
            //therefore it is still empty
            head = newNode;
            tail = newNode;
            return;
        }

        tail.nextValue = newNode;
        tail = newNode;
    }

    public Node getHead(){ // Time Complexity: O(1) (Constant time)
        return head;
    }

    public Node getTail(){ // Time Complexity: O(1) (Constant time)
        return tail;
    }

    public boolean deleteAtHead(){ // Time complexity is O(1) since size of the list don't matter
        if(head == null){
            //is empty
            return false;
        }

        // If there's only one node in the list
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            // More than one node in the list
            head = head.nextValue;
        }
        return true;
    }

    public boolean deleteAtTail(){ // Time complexity is O(n), since whole list has to be traversed
        if(tail == null){
            return false;
        }

        if(head == tail){
            head = null;
            tail = null;
        }
        else {
            //Find the second to last node
            Node tempNode = head;
            while(tempNode.nextValue != tail){
                tempNode = tempNode.nextValue;
            }
            tail = tempNode;
            tail.nextValue = null;
        }
        return true;
    }

    public boolean reverseList(){ // O(n)
        if(head == null){
            return false;
        }
        Node prev = null;
        Node next = null;
        Node current = head;

        while(current != null){
            next = current.nextValue;  // if initially you have 3,4,5 now you have 4,5
            current.nextValue = prev; // now current only has available 2,1
            prev = current; // prev has 3 and next value is 2,1
            current = next; // current has 4,5
        }

        tail = head;
        head = prev;

        if (tail != null) {
            tail.nextValue = null;
        }

        return true;
    }

    public boolean searchValue(int valueIn){ // Time Complexity: O(n), where n is the number of nodes in the linked list.
        if(head == null){
            //linked list is empty
            return false;
        }

        Node tempValue = head;

        while(tempValue != null){
            if(tempValue.value == valueIn){
                return true; // Value found
            }
            tempValue = tempValue.nextValue;
        }
        return false; // Value not found
    }
}
