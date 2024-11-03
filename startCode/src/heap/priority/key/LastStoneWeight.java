package heap.priority.key;

import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//remember to put a,b in bracket for desc order PQ
    //Time C = O(nlogn) Soace C = O(n)
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int s:stones)
            pq.offer(s);
        while(!pq.isEmpty()){
            int first = pq.poll();
            if(pq.isEmpty())return first;
            int sec = pq.poll();
            int diff= Math.abs(first-sec);
            if(diff!=0)
                pq.offer(diff);
        }
        return 0;
    }

}
