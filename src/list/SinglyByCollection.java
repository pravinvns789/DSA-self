package list;

import java.util.LinkedList;

public class SinglyByCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(1);
        list.addLast(2);
        list.add(3);
        list.addLast(4);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);


        list.addFirst(1);
        list.add(3);
        list.addLast(4);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

    }
}
