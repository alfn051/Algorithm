import java.util.*;
//인접행렬 인접리스트로 바꾸는중
class Solution {
    //int[][] graph;
    ArrayList<ArrayList<Integer>> graph;
    int[] visit;
    public int solution(int n, int[][] edge) {
        //graph = new int[n + 1][n + 1];
        graph = new ArrayList<>();
        visit = new int[n + 1];
        for (int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for (int[] i : edge) {
            graph.get(i[0]).add(i[1]);
            graph.get(i[1]).add(i[0]);
        }
        bfs();
        int max = 0;
        int sum = 0;
        for (int i : visit) {
            if (i > max){
                max = i;
                sum = 1;
            }else if(i == max){
                sum ++;
            }
        }
        return sum;
    }
    void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visit[1] = 1;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            ArrayList<Integer> g = graph.get(now);
            for (int i : g) {
                if (visit[i] <= 0){
                    queue.offer(i);
                    visit[i] = visit[now] + 1;
                }
            }
        }
    }
}