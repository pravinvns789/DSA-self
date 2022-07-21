package queueDS;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollectionF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> qu = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println("removed "+ q.remove());
        while (!q.isEmpty()){
            System.out.println(q.remove());
        }

    }
}
