class Solution {
    public String solution(int a, int b) {
        
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        int totalDays = 0;
        
        for (int i = 1; i < a; i++) {
            totalDays += months[i];
        }
        
        totalDays += b;
        
        String answer = dayOfWeek[totalDays % 7];
        return answer;
    }
}