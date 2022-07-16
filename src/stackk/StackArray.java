package stackk;

public class StackArray {
    int[] stack = new int[5];
    int top=-1;
    public void push(int value){
        if(stack.length-1==top){
            System.out.println("overflow");
        }

        top++;
        stack[top]=value;

    }
    public int pop(){
        if(top==-1){
            System.out.println("underflow");
        }
        int ret = stack[top];
        top--;
        return ret;
    }
    public int peek(){
        if (top==-1){
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        StackArray stac = new StackArray();
        stac.push(1);
        stac.push(2);
        stac.push(3);
        stac.push(4);

        while(stac.top!=-1) {
            System.out.println(stac.peek());
            stac.pop();
        }
    }

}
