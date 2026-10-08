import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int c = 0; c < commands.length; c++){
            int[] row = commands[c];
            
            int i = row[0];
            int j = row[1];
            int k = row[2];
            
            int[] sliced_arr = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(sliced_arr);
            
            answer[c] = sliced_arr[k-1];
        }
        
        
        
        
        return answer;
    }
}