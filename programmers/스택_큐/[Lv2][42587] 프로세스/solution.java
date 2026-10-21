import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int process = queue.poll();

            boolean hasHigher = false;
            for (int idx : queue) {
                if (priorities[idx] > priorities[process]) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                queue.add(process);
            } else {
                answer++;
                if (process == location) return answer;
            }
        }
        return answer;
    }
}