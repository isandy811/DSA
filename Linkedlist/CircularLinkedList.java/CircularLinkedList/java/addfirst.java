package CircularLinkedList.java;

class Node {
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
        Node newNode = new Node(d);
        c++;
        if (head == null) {
            head = newNode;
            head.next=head;
            return;
        }
        Node temp = head;
        while(temp.next!=head){
            temp=temp.next;
            temp.next=newNode;
            newNode.next=head;
            head=newNode;
        }
    }

    public void addLast(int d) {
        Node newNode = new Node(d);
        c++;
        if (head == null) {
            head = newNode;
            head.next=head;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            temp.next=newNode;
        }
        newNode.next = head;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        c--;
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head.next;
        Node prev = head;
        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        c--;
        if(head.next==head){
            head=null;
            return;
        }
        Node temp = head;
        while (temp.next!= null) {
            temp = temp.next;
            temp.next=head.next;
            head=head.next;
        }
    }

    void count() {
        System.out.println("Count of nodes: " + c);
    }

    // void traverse() {
    //     System.out.print("Current list: ");
    //     Node temp = head;
    //     while (temp != null) {
    //         System.out.print(temp.data + " ");
    //         temp = temp.next;
    //     }
    //     System.out.println();
    // }






    
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
