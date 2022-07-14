package list;
public class SinglyLinkedList {
    Node head;
    int size=0;
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
            this.next=null;
        }
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        size++;
    }



    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head=newNode;
        size++;
    }


    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.value +"->");
            current=current.next;
        }
        System.out.print("null \n");
    }

    public void find(int value){
        Node current = head;
        while(current!=null){
            if(current.value==value){
                System.out.println("element found");
                return;
            }
            current=current.next;
        }
        System.out.println("element not found");
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(5);
        sll.insert(6);
        System.out.println(sll.size);
        sll.display();
        sll.insertFirst(4);
        System.out.println(sll.size);
        sll.display();
        sll.find(5);
        sll.find(7);

    }
}
