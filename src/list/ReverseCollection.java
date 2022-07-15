package list;

import java.util.LinkedList;
//creating a linked list using collection and using extra space i.e. creating new linked list
public class ReverseCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        LinkedList<Integer> list1=new LinkedList<>();
        for (int i = list.size()-1; i>=0; i--) {
            list1.add(list.get(i));
        }
        System.out.println(list1);
    }
}
