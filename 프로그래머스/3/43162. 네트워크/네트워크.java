class Solution {
    int[][] computers;
    boolean[] visit;
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        visit = new boolean[n];
        int answer = 0;

        while (true) {
            int now = -1;
            for (int i = 0; i < n; i++) {
                if (!visit[i]){
                    now = i;
                    break;
                }
            }
            if (now == -1) break;
            answer++;
            dfs(now);
        }

        return answer;
    }

    void dfs(int now){
        visit[now] = true;
        for (int i = 0; i < computers[now].length; i++) {
            if (!visit[i] && computers[now][i] == 1) dfs(i);
        }
    }
}