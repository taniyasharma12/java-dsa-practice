package linkedLists;

public class LinkedListsDemo {

    private Node head;
    private Node tail;
    private int size;


    public void insertFirst(int value) {

        //update next and head

        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;


    }

    public void insertLast(int value) {

        //update tail's next and tail

        Node newNode = new Node(value);

        tail.next = newNode;
        tail = newNode;
        size++;
    }


    public void insertAtIndex(int val, int index) {

        Node temp = head;

        for (int i = 0; i < index; i++) {

            temp = temp.next;

        }
        Node newNode = new Node(val, temp.next);

        temp.next = newNode;
        size++;
    }

    public int deleteAtHead() {

        int value = head.value;
        head = head.next;

        if (head == null) {

            tail = head;
        }

        size--;
        return value;
    }


    public int deleteAtTail() {

        Node secondLastNode = head;

        for (int i = 0; i < size - 1; i++) {

            secondLastNode = secondLastNode.next;
        }
        tail.value = secondLastNode.value;
        tail = secondLastNode;
        tail.next = null;

        return tail.value;

    }

    public int deleteAtIndex(int index) {

        Node prev = head;

        for (int i = 0; i < index; i++) {

            prev = prev.next;
        }

        prev.value = prev.next.value;

        prev.next = prev.next.next;
        return prev.value;
    }

    public Node getNode(int index) {

        Node node = head;

        for (int i = 0; i < index; i++) {

            node = node.next;

        }
        return node;

    }

    public void display() {

        Node temp = head;

        while (temp != null) {

            System.out.println(temp.value);

            temp = temp.next;

        }
    }

    public void reverseLinkedList() {

        Node first = head;
        Node last = null;

        while (first != null) {

            System.out.println(first.value);
            last = first;
            first = first.next;

        }
        while (last != null) {

            System.out.println(last.value);
            last = last.prev;

        }

    }

    public void reverseLinkedList2() { // 1 2 3 4
        Node current = head;
        Node temp = null;

        while (current != null) {
            // swap next and prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // move to next node (which is previous now)
            current = current.prev;
        }

        // update head
        if (temp != null) {
            head = temp.prev;
        }
    }
}
class Node {

    int value;
    Node next;

    Node prev;

    //A constructor is used to initialize an object at the time of creation.
    public Node(int value, Node next) { //Node node1 = new Node(10, node2);
        this.value = value;
        this.next = next;
    }

    public Node(int value) { //Node node2 = new Node(20);
        this.value = value;
    }


}


