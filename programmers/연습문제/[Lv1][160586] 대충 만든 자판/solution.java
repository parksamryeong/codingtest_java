import java.util.*;


class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> min = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int press = i + 1;
                min.put(c, Math.min(min.getOrDefault(c, press), press));
            }
        }

        int[] answer = new int[targets.length];
        
        for (int t = 0; t < targets.length; t++) {
            int sum = 0;
            for (char c : targets[t].toCharArray()) {
                if (!min.containsKey(c)) {
                    sum = -1;
                    break;
                }
                sum += min.get(c);
            }
            answer[t] = sum;
        }
        return answer;
    }
}