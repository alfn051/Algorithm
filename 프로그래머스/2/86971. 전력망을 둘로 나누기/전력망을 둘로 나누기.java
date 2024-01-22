import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
class Solution {
    int n;
    int[][] arr;
    boolean[] visit;
    int cnt;
    public int solution(int n, int[][] wires) {
        Set<Integer> results = new HashSet<>();
        this.n = n;
        for (int i = 0; i < n; i++) {
            makeArr(n, wires, i);
            visit = new boolean[n+1];
            cnt = 0;
            countInDfs(1);
            results.add(Math.abs(n - 2* cnt));
        }
        return Collections.min(results);
    }

    public void countInDfs(int start) {
        visit[start] = true;
        cnt++;
        for (int i = 1; i <= n; i++) {
            if(arr[start][i] == 1 && !visit[i]){
                countInDfs(i);
            }
        }
    }

    public void makeArr(int n, int[][] wires, int except) {
        arr = new int[n+1][n+1];
        for (int i = 0; i < wires.length; i++) {
            if(i == except) continue;
            arr[wires[i][0]][wires[i][1]] = arr[wires[i][1]][wires[i][0]] = 1;
        }
    }
}