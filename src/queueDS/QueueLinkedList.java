package queueDS;

public class QueueLinkedList {
    Node front=null;
    Node rear=null;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public boolean isEmpty(){
        return front==null && rear==null;
    }
    //enqueue
    public void add(int data){
        Node newNode = new Node(data);
        if(front==null && rear==null){
            front=rear=newNode;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        if(front==rear){
            rear=null;
        }
        int val = front.data;
        front=front.next;
        return val;
    }
    public int peek(){
        if (isEmpty()){
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("removed "+ q.remove());
        while (!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
