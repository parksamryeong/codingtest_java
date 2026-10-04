class Solution {
    public boolean solution(int x) {
        int cal_x = x;
        int sum = 0;
        
        while(cal_x != 0){
            sum += cal_x % 10;
            cal_x /= 10;
        }
        
        return x % sum == 0;
    }
}