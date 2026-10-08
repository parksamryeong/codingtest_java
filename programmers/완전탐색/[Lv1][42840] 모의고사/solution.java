import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int s1_sol = 0;
        int s2_sol = 0;
        int s3_sol = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (s1[i % s1.length] == answers[i]) s1_sol++;
            if (s2[i % s2.length] == answers[i]) s2_sol++;
            if (s3[i % s3.length] == answers[i]) s3_sol++;
        }
        
        int[] score = {s1_sol, s2_sol, s3_sol};        
        int max_score = Math.max(s1_sol, Math.max(s2_sol, s3_sol));
        
        List<Integer> list = new ArrayList<>();
        
        for (int w = 0; w < score.length; w++) {
            if (score[w] == max_score) {
                list.add(w + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}