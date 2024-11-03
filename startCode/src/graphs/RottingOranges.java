package graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {
	
	/*Time Complexity
	Initialization: The method begins with a nested loop to iterate through the grid, which has m rows and n columns. This takes O(m×n) time to count fresh oranges and add rotten oranges to the queue.
	BFS Loop: The main part of the method uses a breadth-first search (BFS) approach:
	Each rotten orange can potentially spread to its adjacent fresh oranges.
	In the worst case, all oranges (both fresh and rotten) will be processed. If we assume there are O(m×n) oranges, the BFS will also take O(m×n) time in total.
	Thus, the overall time complexity is:Time Complexity: O(m×n)
	Space Complexity
	Queue: The queue can hold at most all the oranges in the grid at once, which could be up to O(m×n) in the worst case (if all oranges are rotten initially).
	Additional Variables: The method uses a few additional variables (like fresh, time, cur, etc.), which use constant space.
	Therefore, the overall space complexity is:Space Complexity: O(m×n)
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int orangesRotting(int[][] grid) {
	       int rows = grid.length;
	       int cols = grid[0].length;
	       int fresh = 0;
	       int time = 0;
	       Queue<int[]> que = new ArrayDeque<>();
	       //Queue<int[]> que = new LinkedList<>();
	       for(int i=0;i<rows;i++){
	        for(int j=0;j<cols;j++){
	            if(grid[i][j]==1)
	                fresh++;
	            if(grid[i][j]==2)
	                que.offer(new int[]{i,j});
	        }
	       }
	       int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
	       while(fresh>0 && !que.isEmpty()){
	            int len = que.size();
	            for(int i=0;i<len;i++){
	                int cur[] = que.poll();
	                int x=cur[0];
	                int y= cur[1];
	                for(int[] d:dirs){
	                    int row = x+d[0];
	                    int col = y+d[1];
	                    if(row>=0 && col>=0 && row<rows && col<cols && grid[row][col]==1){
	                        grid[row][col]=2;
	                        que.offer(new int[]{row,col});
	                        fresh--;
	                    }
	                }
	            }
	            time++;
	       }
	       return fresh==0 ? time : -1;
	    }

}
