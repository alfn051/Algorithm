import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int[][] visit;
    int[][] maps;
    int n, m;
    public int solution(int[][] maps) {
        this.maps = maps;
        n = maps.length;
        m = maps[0].length;
        visit = new int[n][m];
        bfs();
        int answer = visit[n-1][m-1];
        if(answer<=0) return -1;
        return answer;
    }

    public void bfs() {
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        visit[0][0] = 1;
        while( !queue.isEmpty() ) {
            int[] now = queue.poll();
            for(int i=0; i<4; i++) {
                int dn = now[0] + dy[i];
                int dm = now[1] + dx[i];
                if (dn >= 0 && dn < n && dm >= 0 && dm < m && visit[dn][dm] == 0 && maps[dn][dm] == 1) {
                    queue.offer(new int[]{dn, dm});
                    visit[dn][dm] = visit[now[0]][now[1]] + 1;
                }
            }
        }
    }
}