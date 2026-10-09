import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> last = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last.containsKey(c)) {
                answer[i] = i - last.get(c);
            } else {
                answer[i] = -1;
            }
            last.put(c, i);
        }
        return answer;
    }
}