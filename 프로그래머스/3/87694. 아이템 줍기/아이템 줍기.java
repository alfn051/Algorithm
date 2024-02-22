import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int[][] map = new int[101][101];
    int count = -1;
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        for (int[] rect : rectangle){
            for (int i = rect[0]*2; i <= rect[2]*2; i++) map[i][rect[1]*2] = map[i][rect[3]*2] = 1;
            for (int i = rect[1]*2; i <= rect[3]*2; i++) map[rect[0]*2][i] = map[rect[2]*2][i] = 1;
        }
        for (int[] rect : rectangle){
            for (int i = rect[0]*2 + 1; i <= rect[2]*2-1; i++){
                for (int j = rect[1]*2 + 1; j <= rect[3]*2-1; j++) map[i][j] = 0;
            }
        }

        bfs(characterX*2, characterY*2);

        return (map[itemX*2][itemY*2] - 1) / 2;
    }

    void bfs(int x, int y) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        map[x][y] = 2;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if (nx >= 0 && nx < 101 && ny >= 0 && ny < 101 && map[nx][ny] ==1){
                    q.offer(new int[]{nx, ny});
                    map[nx][ny] = map[now[0]][now[1]] + 1;
                }
            }
        }
    }
}