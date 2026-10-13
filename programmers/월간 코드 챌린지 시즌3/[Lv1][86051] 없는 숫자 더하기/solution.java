class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int num : numbers){
            for(int i = 0; i < 10; i++){
                if(num == i){
                    answer -= i;
                }
            }
        }
        
        
        return answer;
    }
}