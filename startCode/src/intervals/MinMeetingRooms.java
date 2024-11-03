package intervals;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinMeetingRooms {
	
	public int minMeetingRooms(List<Interval> intervals) {
        //TC = O(nlogn) SC= O(n)
        Collections.sort(intervals,(a,b)->a.start-b.start);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Interval i: intervals){
            if(pq.isEmpty()){
                pq.offer(i.end);
            }else{
                if(i.start<pq.peek())
                    pq.offer(i.end);
                else{
                    pq.poll();
                    pq.offer(i.end);
                }
            }
        }
        return pq.size();
    }

}

class Interval {
	  public int start, end;
	  public Interval(int start, int end) {
	       this.start = start;
	       this.end = end;
	 }
}
