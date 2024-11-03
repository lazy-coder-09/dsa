package array.and.hashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// try adding same value for i row ,j col & i/3,j/3 block
    //if at any place duplicate number is tried to insert it will throw error
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet();
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                    continue;
                else{
                    if((!set.add(String.valueOf(board[i][j])+"row"+i)) || 
                    (!set.add(String.valueOf(board[i][j])+"col"+j)) ||
                    (!set.add(String.valueOf(board[i][j])+"block"+i/3+j/3)))
                        return false;
                }
            }
        }
        return true;
    }

}
