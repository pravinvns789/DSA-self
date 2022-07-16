package stackk;
public class StackDS {
    Node head;
    class Node {

        Node next;
        int value;

        Node(int value) {
            this.value = value;
            next = null;

        }
    }

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int value){
            Node newNode = new Node(value);

            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }


        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.value;
        }

        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.value;
        }


    public static void main(String[] args) {
        StackDS stack = new StackDS();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}