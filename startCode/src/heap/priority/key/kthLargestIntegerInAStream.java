package heap.priority.key;

import java.util.PriorityQueue;

public class kthLargestIntegerInAStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int k;
    PriorityQueue<Integer> pq;
    public kthLargestIntegerInAStream(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k=k;
        for(int n:nums){
            pq.offer(n);
            if(pq.size()>k)
                pq.poll();
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>k)
            pq.poll();
        return pq.peek();
    }

}
