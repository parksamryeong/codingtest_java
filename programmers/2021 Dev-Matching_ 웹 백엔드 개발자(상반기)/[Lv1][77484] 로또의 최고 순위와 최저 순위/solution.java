import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        
        Set<Integer> win = new HashSet<>();
        for (int w : win_nums){
            win.add(w);
        }
        
        int unknown = 0;
        int match = 0;
        
        for (int num : lottos) {
            if (num == 0){
                unknown++;
            }
            else if(win.contains(num)){
                match++;
            }
        }
        int[] answer = {rank[match + unknown], rank[match]};
        
        return answer;
    }
}