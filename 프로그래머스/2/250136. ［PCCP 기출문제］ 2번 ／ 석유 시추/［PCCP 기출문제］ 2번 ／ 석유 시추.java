import java.util.*;

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};
    int n, m;
    int[][] land;
    int[][] oil;

    public int solution(int[][] land) {
        this.land = land;
        this.n = land.length;
        this.m = land[0].length;
        this.oil = new int[n][m];

        int group = 1;
        Map<Integer, Integer> oilSize = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && oil[i][j] == 0) {
                    int size = bfs(i, j, group);
                    oilSize.put(group, size);
                    group++;
                }
            }
        }
        int[] columnSum = new int[m];
        for (int j = 0; j < m; j++) {
            Set<Integer> groups = new HashSet<>();
            for (int i = 0; i < n; i++) {
                groups.add(oil[i][j]);
            }
            groups.remove(0);
            for (int g : groups) {
                columnSum[j] += oilSize.get(g);
            }
        }
        return Arrays.stream(columnSum).max().getAsInt();
    }

    int bfs(int x, int y, int group) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        oil[x][y] = group;
        int size = 1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && land[nx][ny] == 1 && oil[nx][ny] == 0) {
                    queue.offer(new int[]{nx, ny});
                    oil[nx][ny] = group;
                    size++;
                }
            }
        }
        return size;
    }
}