class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    int c = 0;

    public void addFirst(int d) {
        System.out.println("Inserting " + d + " at the beginning.");
        Node newNode = new Node(d);
        c++;
        if (head == null) {
            head = newNode;
            traverse();
            return;
        }
        newNode.next = head;
        head = newNode;
        traverse();
    }

    public void addLast(int d) {
        System.out.println("Inserting " + d + " at the end.");
        Node newNode = new Node(d);
        c++;
        if (head == null) {
            head = newNode;
            traverse();
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        traverse();
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        System.out.println("Deleting from the end.");
        c--;
        if (head.next == null) { // Only one node in the list
            head = null;
            traverse();
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        traverse();
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        System.out.println("Deleting from the beginning.");
        c--;
        head = head.next;
        traverse();
    }

    void count() {
        System.out.println("Count of nodes: " + c);
    }

    void traverse() {
        System.out.print("Current list: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       Main ls = new Main();
        ls.addFirst(1);
        ls.addFirst(2);
        ls.addFirst(13);
        ls.addFirst(15);
        ls.count();
        ls.deleteFirst();
        ls.addLast(12);
        ls.addLast(34);
        ls.deleteLast();
        ls.count();
    }
}