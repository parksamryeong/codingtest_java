class Solution {
    public int solution(String s) {
        char x = ' ';
        int x_count = 0;
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(x_count == 0){
                x = s.charAt(i);
                answer++;
            }
            
            if (s.charAt(i) == x){
                x_count++;
            }else {
                x_count--;
            }
        }
        
        return answer;
    }
}