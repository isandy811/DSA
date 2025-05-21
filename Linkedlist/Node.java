package Linkedlist;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class addfirst {
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
    public static void main(String[] args) {
        Main ls = new Main();
         ls.addFirst(1);
         ls.addFirst(2);
         ls.addFirst(13);
         ls.addFirst(15); 
     }
 }

