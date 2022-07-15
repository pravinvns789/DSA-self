package list;
public class QuestionSingly {
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
    public void sizel(){
        Node current = head;
        int s=0;
        while(current!=null){
            s++;
            current=current.next;
        }
        System.out.println(s);
    }

    //question on linked list

    public void revereIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node preNode = head;
        Node curNode = head.next;
        while (curNode!=null){
            Node nextNode = curNode.next;
            curNode.next=preNode;
            preNode=curNode;
            curNode=nextNode;
        }
        head.next=null;
        head=preNode;
    }

    public Node recusiveReverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=recusiveReverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    // find n-th element from starting
    public Node nthElemen(int n){
        Node current = head;
        for (int i = 1; i <n; i++) {
            current=current.next;
        }
        return current;
    }

    // find nth-element from end
    public void nthfromLast(int n){
        int s=getSize();
        int a = s-n+1;
        Node current = head;
        for (int i = 1; i < a; i++) {
            current=current.next;
        }
        System.out.println(current.value);

    }
    // deleat n-th element
    public void deleteNthElement(int n){
        int s=getSize();
        int a = s-n;
        Node current=head;
        for (int i = 1; i < a; i++) {
            current=current.next;
        }
        current.next=current.next.next;


    }




    public static void main(String[] args) {
        QuestionSingly sll = new QuestionSingly();
        sll.addFirst(2);
        sll.addFirst(1);
        sll.addLast(3);
        sll.addLast(4);
        sll.addLast(5);
        sll.print();
        System.out.println(sll.getSize());
        sll.sizel();
        sll.revereIterate();
        sll.print();
        sll.head=sll.recusiveReverse(sll.head);
        sll.print();
        System.out.println(sll.nthElemen(1).value);
        sll.nthfromLast(1);
        sll.deleteNthElement(3);
        sll.print();


    }
}
