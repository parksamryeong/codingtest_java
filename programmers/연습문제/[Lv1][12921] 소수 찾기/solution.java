class Solution {
    public int solution(int n) {
        int answer = n - 1;
        boolean[] isPrime = new boolean[n + 1];
        
        for(int i = 2; i <= n; i++){
            isPrime[i] = true;
        }
        
        for(int i = 2; i * i <= n; i++){
            for(int j = i * i; j <= n; j += i){
                if(isPrime[j]){
                    isPrime[j] = false;
                    answer--;
                }
            }
        }
        
        return answer;
    }
}