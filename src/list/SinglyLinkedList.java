package list;
public class SinglyLinkedList {
   Node head;
   int size;
   class Node {
       int value;
       Node next;
       Node(int value){
           this.value=value;
           this.next=null;
           size++;
       }
   }
   //add
    public void addFirst(int value){

       Node newNode = new Node(value);
       if(head==null){
           head=newNode;
           return;
       }
       newNode.next=head;
       head=newNode;

    }
    public void addLast(int value){
       Node newNode = new Node(value);
       if(head==null){
           head=newNode;
           return;
       }
       Node current = head;
       while(current.next!=null){
           current=current.next;
       }
       current.next=newNode;
    }
    //print
    public void print(){
       if(head==null){
           System.out.println("list is empty");
       }
       Node current = head;
       while (current!=null){
           System.out.print(current.value+"->");
           current=current.next;
       }
        System.out.println("null");
    }
    //remove
    public void removeFirst(){
       if(head==null){
           System.out.println("list is empty");
           return;
       }
       size--;
       head=head.next;
    }

    public void removeLast(){
       if(head==null){
           System.out.println("list is empty");
           return;
       }
       size--;
       if(head.next==null){
           head=null;
           return;
       }
       Node lastnode = head.next;
       Node secondLast = head;
       while (lastnode.next!=null){
           secondLast=secondLast.next;
           lastnode=lastnode.next;
       }
       secondLast.next=null;

    }

    //size
    public int getSize(){
       return size;
    }



    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(1);
        sll.addFirst(2);
        sll.addLast(3);
        sll.print();
        System.out.println(sll.getSize());
        sll.removeFirst();
        sll.print();
        System.out.println(sll.getSize());
        sll.removeLast();
        sll.print();
        System.out.println(sll.getSize());
        sll.removeLast();
        sll.print();
        System.out.println(sll.getSize());


    }
}
