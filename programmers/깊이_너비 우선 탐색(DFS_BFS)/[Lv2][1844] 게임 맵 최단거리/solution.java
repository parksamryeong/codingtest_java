import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        int n = maps.length;
        int m = maps[0].length;
        
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        int[][] dist = new int[n][m];
        for(int[] row : dist){
            Arrays.fill(row, -1);
        }
        
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0,0});
        dist[0][0] = 1;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            
            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (maps[nx][ny] == 0) continue;
                if (dist[nx][ny] != -1) continue;
                
                dist[nx][ny] = dist[x][y] + 1;
                q.offer(new int[]{nx,ny});
            }
        }
        
        return dist[n - 1][m - 1];
    }
}