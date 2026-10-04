class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        String[] str = String.valueOf(x).split("");
        
        for(String num : str) {
            sum += Integer.parseInt(num);
        }
        
        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}