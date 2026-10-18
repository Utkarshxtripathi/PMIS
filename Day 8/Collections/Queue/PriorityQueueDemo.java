import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Topic: Collections Framework - Queue: PriorityQueue
 * Subtopics: Min-heap / Max-heap, offer(), poll(), peek(), custom comparator ordering
 * 
 * Features:
 * - Elements ordered according to natural ordering or Comparator
 * - Does NOT permit null elements
 * - Head is the least element with respect to specified ordering
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);

        // TODO: Practice queue polling and priority ordering
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
