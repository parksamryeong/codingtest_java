class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long cost = 0;
        
        for(int i = 1; i <= count; i++){
            cost += (long)i * price;
        }
        
        if(money < cost){
            answer = cost - money;
        }else{
            answer = 0;
        }

        return answer;
    }
}