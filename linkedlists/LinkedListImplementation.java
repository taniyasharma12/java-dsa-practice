package linkedLists;

public class LinkedListImplementation {

    //1. Node class which contains value and pointer to next node

    private Node head;
    private Node tail;
    private int size;

    public LinkedListImplementation() {

        this.size = 0;
    }

    public int deleteAtHead() {

        int value = head.value; //Store the current head’s value.

        head = head.next;  //Move the head pointer to the next node.
        // The first node is effectively dropped because nothing points to it now.

        if (head == null) {

            tail = null;
        }
        size--;
        return value;
    }

    public int deleteAtLast() {

        if (size <= 1) {

            return deleteAtHead();
        }

        Node secondLastNode = getNode(size - 2);
        int value = tail.value;
        tail = secondLastNode;
        tail.next = null;

        return value;
    }

    public int deleteAtIndex(int index) {


        if (index == 0) {

            return deleteAtHead();
        }

        if (index == size - 1) {

            return deleteAtLast();
        }

        Node prev = getNode(index - 1);

        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node getNode(int index) {

        Node node = head;

        for (int i = 0; i < index; i++) {

            node = node.next;
        }

        return node;
    }

    public void insertFirst(int value) {

        //need to update next and head
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead; //head always points to the first node
        if (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public void insertLast(int val) {
        if (tail == null) {

            insertFirst(val);
            return;
        }
        Node node = new Node(val);

        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int val, int index) {

        if (index == 0) {

            insertFirst(val);
            return;
        }
        if (index == size) {

            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {

            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public Node find(int value) {

        Node node = head;

        while (node != null) {

            if (node.value == value) {
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {

            System.out.println(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");


    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {

            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }

    }
}
