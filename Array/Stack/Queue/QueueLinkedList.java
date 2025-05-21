// package Queue;

// public class Node {
//     int data;
//     Node next;
//     Node(int d){
//         data=d;
//         next=null;
//     }
//     void insertion(int d){
//         if(rear==max-1){
//             System.out.print("Queue is full.");
//         }
//         if(front==-1){
//             front=rear=0;

//         }
//     }
// }
package Queue;
public class QueueLinkedList {
    Node front=null,rear=null;
    void insert(int ele)
    {
        Node newNode=new Node(ele);
        if(rear==null)
        {
            front=newNode;
            rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    void delete()
    {
        if(front==null)
        {
            System.out.println("queue is empty ");
            return;
        }
        if(front==rear)
        {
            front=rear=null;
            return;
        }
        front=front.next;
    }
    void traverse()
    {
        if(front==null)
        {
            System.out.println("queue is empty ");
            return;
        }
        System.out.println("All element are ");
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
public static void main(String[] args) {
    QueueLinkedList q1=new QueueLinkedList();
    q1.delete();
    q1.traverse();
    q1.insert(1);
    q1.insert(2);
    q1.insert(3);
    q1.traverse();
    q1.delete();
    q1.traverse();
    q1.delete();
    q1.delete();
    q1.traverse();
   }
}




