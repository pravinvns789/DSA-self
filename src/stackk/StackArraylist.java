package stackk;

import java.util.ArrayList;

public class StackArraylist {
   ArrayList<Integer> s = new ArrayList<>();
   public void push(int value){
       s.add(value);
   }
   public int pop(){
       int top = s.get(s.size()-1);
       s.remove(s.size()-1);
       return top;
   }
   public int peek(){
       return s.get(s.size()-1);
   }

    public static void main(String[] args) {
       StackArraylist stac = new StackArraylist();
        stac.push(1);
        stac.push(2);
        stac.push(3);
        stac.push(4);

        while(stac.s.size()!=0) {
            System.out.println(stac.peek());
            stac.pop();
        }
    }
}
