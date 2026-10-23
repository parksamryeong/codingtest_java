import java.util.*;

class Solution {
    
    static List<List<Integer>> graph;
    static boolean[] visited;
    
    static int dfs(int cur){
        visited[cur] = true;
        int cnt = 1;
        for(int next : graph.get(cur)){
            if(!visited[next]) cnt += dfs(next);
        }
        return cnt;
    }
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 0; i < wires.length; i++){
            graph = new ArrayList<>();
            for(int k = 0; k <= n; k++){
                graph.add(new ArrayList<>());
            }
            
            for(int j = 0; j < wires.length; j++){
                if(j == i) continue;
                graph.get(wires[j][0]).add(wires[j][1]);
                graph.get(wires[j][1]).add(wires[j][0]);
            }
            
            visited = new boolean[n + 1];
            int cnt = dfs(1);
            answer = Math.min(answer, Math.abs(cnt - (n - cnt)));
        }
        
        return answer;
    }
}