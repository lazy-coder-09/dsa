package heap.priority.key;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int num : nums)
            pq.offer(num);
        int counter = 1;
        while(counter<k){
            pq.poll();
            counter++;
        }
        return pq.peek();
    }
}
