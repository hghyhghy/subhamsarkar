
public class LL {
    Node head;

    class Node {

        String data;

        Node next;
        // constructor

        Node(String data) {

            this.data = data;
            this.next = null;
        }

    }

    // add at position first at linked list

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        }

        newNode.next = head;

        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;

        }

        currNode.next = newNode;

    }

    public void printList() {
        if (head == null) {

            System.out.println("list is empty:");
            return;

        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }

        System.out.println("NULL");

    }

    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst("A PASSIONATE CODER");
        list.addFirst("SARKAR");
        list.addFirst("SUBHAM");
        list.addFirst("am");
        list.addFirst("I");
        list.printList();

    }

}
