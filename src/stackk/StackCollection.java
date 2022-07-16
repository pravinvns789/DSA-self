package stackk;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stac = new Stack<>();
        stac.push(1);
        stac.push(2);
        stac.push(3);
        stac.push(4);

        while(!stac.isEmpty()) {
            System.out.println(stac.peek());
            stac.pop();
        }

    }
}
