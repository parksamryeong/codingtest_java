class Solution {
    public String solution(int[] food) {
        StringBuilder half = new StringBuilder();
        
        for(int i = 0; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++){
                half.append(i);
            }
        }
        
        String answer = half.toString() + "0" + half.reverse().toString();
        return answer;
    }
}