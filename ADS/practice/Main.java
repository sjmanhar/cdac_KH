class Node {
    public Object item;
    public Node next;
}

class LinkedList {
    private int size;
    private Node head;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }

    public void insertNode(String item) {
        Node node = new Node();
        node.item = item;
        Node current = this.head;

        if (this.head == null) {
            this.head = node;
            this.head.next = null;
            this.size = 1;
            System.out.println("Inserted at head: " + this.head.item);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.next = null;
            this.size += 1;
        }
    }

    public void printNodes() {
        if (this.size < 1) {
            System.out.println("There are no nodes in the linked list");
        } else {
            Node current = this.head;
            int index = 1;
            while (current != null) {
                System.out.println("Node " + current.item + " is at location " + index);
                current = current.next;
                index++;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertNode("test1");
        list.insertNode("test2");
        list.insertNode("test3");

        list.printNodes();
    }
}
