import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int[][] matrix;
    boolean[] visit;
    public int solution(int n, int[][] costs) {
        matrix = new int[n][n];
        Arrays.sort(costs, ((o1, o2) -> o1[2] - o2[2]));
        int answer = 0;
        for (int[] arr : costs) {
            if (bfs(arr[0], arr[1])) continue;
            matrix[arr[0]][arr[1]] = matrix[arr[1]][arr[0]] = arr[2];
            answer+= arr[2];
            if (bfs(arr[0], -1)) {
                break;
            }
        }
        return answer;
    }

    boolean bfs(int start, int target){ //target 이 -1이면 모든노드가 연결된 여부 검사, 아니면 start 와 target 이 연결되어있는지 검사
        visit = new boolean[matrix.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visit[start] = true;
        while (!queue.isEmpty()){
            int now = queue.poll();
            for (int i = 0; i < matrix[now].length; i++) {
                if (matrix[now][i] > 0 && !visit[i]){
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }
        if (target >= 0){
            return visit[target];
        }

        for (boolean b : visit) {
            if (!b) return false;
        }
        return true;
    }
}