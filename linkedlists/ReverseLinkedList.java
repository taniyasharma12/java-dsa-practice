package linkedLists;

public class ReverseLinkedList {

    private Node1 head;

    private Node1 tail;

    private int value;

    public void reverse() {

        Node1 current = head;
        Node1 temp = null;

        while (current != null) {

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











class Node1 {

    Node1 prev;
    Node1 next;

    int value;

    public Node1(int value) {

        this.value = value;
    }

    public Node1(int value, Node1 next) {

        this.value = value;
        this.next = next;
    }

}
