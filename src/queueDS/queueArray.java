package queueDS;

public class queueArray {
    int[] queue;
    int size;
    queueArray(int size){
        queue=new int[size];
        this.size=size;

    }
    int rear=-1;
    public boolean isEmpty(){
        return rear==-1;
    }
    public void add(int value){
        if(rear==queue.length-1){
            System.out.println("overflow");
            return;
        }
        rear++;
        queue[rear]=value;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        int front=queue[0];
        for(int i=0;i<rear;i++){
            queue[i]=queue[i+1];
        }
        rear--;
        return front;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        int front=queue[0];
        return front;
    }

    public static void main(String[] args) {
        queueArray q = new queueArray(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
