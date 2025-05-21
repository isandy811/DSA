public class LinkedListt {
    
    private Node head;
    private Node tail;
    private int length;
    
    //inner
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    //class or nested class


    public LinkedListt(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public void printList() {
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }


    // public void getHead() {
    //     System.out.println("Head: " + head.value);
    // }

    // public void getTail() {
    //     System.out.println("Tail: " + tail.value);
    // }

    // public void getLength() {
    //     System.out.println("Length: " + length);
    // }

    public void append(int value){
        Node newNode=new Node(value);
        if(length == 0){
            head=newNode;
            tail=newNode;
        } else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }


    public Node removeLast() { //Node -> node being returned
        if(length==0) return null;

        Node temp=head;
        Node pre=head;
        while(temp.next!=null){
            pre=temp;   
            temp=temp.next; 
        }
        tail=pre;
        tail.next=null;
        length--;

        if(length==0){ // if mets the codn. after the length--
            head=null;
            tail=null;
        }
        return temp;
    }

    public static void main(String[] args){
        LinkedListt myLinkedList = new LinkedListt(1);

        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();

        myLinkedList.append(2);
        //myLinkedList.append(3);
        //myLinkedList.append(4);
        //myLinkedList.append(5);

        //(2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        //(1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        //(0) Items - Returns null
        System.out.println(myLinkedList.removeLast());

        //myLinkedList.printList();
    }

}
