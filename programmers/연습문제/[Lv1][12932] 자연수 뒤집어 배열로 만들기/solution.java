class Solution {
    public int[] solution(long n) {
        
        String str_num = Long.toString(n);
        int len = str_num.length();
        int[] answer = new int[len];
        
        for(int i = len - 1; i >= 0; i--){
            answer[len - 1 - i] = Character.getNumericValue(str_num.charAt(i));
        }
        
        return answer;
    }
}