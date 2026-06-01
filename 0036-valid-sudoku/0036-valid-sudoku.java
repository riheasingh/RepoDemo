
import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                
                char c = board[i][j];
                
                if(c != '.') {
                    
                    // row check
                    if(!set.add(c + "row" + i))
                        return false;
                    
                    // column check
                    if(!set.add(c + "col" + j))
                        return false;
                    
                    // 3x3 box check
                    if(!set.add(c + "box" + i/3 + "-" + j/3))
                        return false;
                }
            }
        }
        
        return true;
    }
}

