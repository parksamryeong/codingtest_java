class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        for(int i = 0; i < n; i++){
            students[i] = 1;
        }
        
        for(int l : lost){
            students[l - 1]--;
        }
        
        for(int r : reserve){
            students[r - 1]++;
        }
        
        for(int i = 0; i < n; i++){
            if(students[i] == 0){
                if(i > 0 && students[i - 1] == 2){
                    students[i - 1]--;
                    students[i]++;
                }else if(i < n -1 && students[i + 1] == 2){
                    students[i + 1]--;
                    students[i]++;
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < n; i++){
            if(students[i] >= 1){
                answer++;
            }
        }
        
        return answer;
    }
}