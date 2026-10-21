import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> result = new ArrayList<>();

        int lead = (100 - progresses[0] + speeds[0] - 1) / speeds[0];
        int count = 1;

        for (int i = 1; i < progresses.length; i++) {
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

            if (day <= lead) {
                count++;
            } else {
                result.add(count);
                lead = day;
                count = 1;
            }
        }
        result.add(count);

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}