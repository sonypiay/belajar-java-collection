package programmer.zaman.now.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> stringQueue = new ArrayDeque<>();
        Queue<String> stringQueue = new PriorityQueue<>();

        stringQueue.add("Sony");
        stringQueue.add("Darmawan");
        stringQueue.add("Eko");

        System.out.println(stringQueue.size());

//        for (int i = 0; i < 10; i++) {
//            stringQueue.add(String.valueOf(i));
//        }

        for (String next = stringQueue.poll(); next != null; next = stringQueue.poll()) {
            System.out.println(next);
        }

        System.out.println(stringQueue.size());
    }
}
