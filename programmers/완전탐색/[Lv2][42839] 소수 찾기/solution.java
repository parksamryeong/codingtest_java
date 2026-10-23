import java.util.*;

class Solution {
    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        
        dfs("", numbers, visited, set);
        
        int answer = 0;
        
        for(int n : set){
            if(isPrime(n)) answer++;
        }
        return answer;
    }
    
    void dfs(String cur, String numbers, boolean[] visited, Set<Integer> set){
        if (!cur.isEmpty()) {
            set.add(Integer.parseInt(cur));
        }
        for (int i = 0; i < numbers.length(); i++) {
            if (visited[i]) continue;
            visited[i] = true;
            dfs(cur + numbers.charAt(i), numbers, visited, set);
            visited[i] = false;
        }
    }
    
    boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
}