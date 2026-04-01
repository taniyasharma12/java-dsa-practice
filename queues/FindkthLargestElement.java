package queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindkthLargestElement {

    //Create a min heap of size k such that the heap has last k elements of sorted array and since its min heap the smallest element will be at top which will be the kth largest element
//In Java, PriorityQueue is a Min Heap by default.

    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 7, 15, 12, 23, 45};
        int k = 2;
        System.out.print(solution(arr, k));

    }

    public static int solution(int[] arr, int k) {


        Queue<Integer> queue = new PriorityQueue<Integer>();

        for (int i = 0; i < k; i++) {

            queue.add(arr[i]); //3, 4 peek 3 (6>3)
        }
        // 4, 6 (7>4)
        // 6, 7 (15>6)
        //7,15 (12>7)
        //12,15 (23>12)
        //15,23(45>15)
        //23,45
        System.out.println(queue);
        System.out.println(queue.peek());
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > queue.peek()) {

                queue.remove();
                queue.add(arr[i]);
            }
        }
        return queue.peek();
    }

}


//give   PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); for finding kth smallest element


/*

Min Heap

Parent node ≤ Child nodes.

The smallest element is always at the root (peek()).

Example:

        2
      /   \
     4     5
    / \   / \
   7   8  9  10


Here, 2 is the smallest → root.

In Java:

PriorityQueue<Integer> minHeap = new PriorityQueue<>();

Max Heap

Parent node ≥ Child nodes.

The largest element is always at the root (peek()).

Example:

        10
      /    \
     9      8
    / \    / \
   7   6  5   4


Here, 10 is the largest → root.

In Java:

PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


👉 Shortcut to remember:

Min Heap → root is the minimum (default in Java).

Max Heap → root is the maximum (use Collections.reverseOrder() to flip).
 */
