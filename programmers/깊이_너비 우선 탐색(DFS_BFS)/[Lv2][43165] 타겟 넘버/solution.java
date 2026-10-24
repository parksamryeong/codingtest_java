class Solution {
    
    static int dfs(int[] numbers, int idx, int sum, int target) {
        if (idx == numbers.length) {
            return sum == target ? 1 : 0;
        }
        int plus  = dfs(numbers, idx + 1, sum + numbers[idx], target);
        int minus = dfs(numbers, idx + 1, sum - numbers[idx], target);
        return plus + minus;
    }
    
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }
}