class Solution {
    public long solution(long n) {
        for(int x = 1; x * x <= n; x++){
            if(x * x == n){
                return (x + 1) * (x + 1);
            }
        }
        
        return -1;
    }
}