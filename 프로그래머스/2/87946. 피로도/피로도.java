import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Solution {
    int[][] dungeons;
    boolean[] visited;
    Set<Integer> result = new HashSet<>();
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        permutation(0, k);
        return Collections.max(result);
    }
    void permutation(int cnt, int k) {
        result.add(cnt);
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                permutation(cnt + 1, k - dungeons[i][1]);
                visited[i] = false;
            }
        }
    }
}