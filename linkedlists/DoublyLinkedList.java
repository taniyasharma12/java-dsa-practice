package linkedLists;

public class DoublyLinkedList {
    private Node head;

    public void insertFirst(int val) {

        Node newNode = new Node(val);

        newNode.next = head;

        newNode.prev = null;

        if (head != null) {

            head.prev = newNode;
        }

        head = newNode;

    }

    public void insertLast(int val) {

        Node newNode = new Node(val);

        Node last = head;
        newNode.next = null;

        while (last.next != null) {

            last = last.next;
        }

        if (head == null) {

            newNode.prev = null;
            head = newNode;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void reverseLinkedList() {

        Node last = null;
        Node node = head;

        while (node != null) {

            System.out.println(node.val);
            last = node;
            node = node.next;
        }
        while (last != null) {

            System.out.println(last.val);
            last = last.prev;
        }


    }

    class Node {

        private int val;

        private Node next;

        private Node prev;

        public Node(int val) {

            this.val = val;


        }

        public Node(int val, Node next, Node prev) {

            this.val = val;
            this.next = next;
            this.prev = prev;

        }
    }

}
