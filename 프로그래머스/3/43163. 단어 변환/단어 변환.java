class Solution {
    String[] words;
    boolean[] visit;
    String target;
    int count = 100;
    public int solution(String begin, String target, String[] words) {
        this.words = words;
        this.target = target;
        visit = new boolean[words.length];
        dfs(begin, 0);
        return count != 100 ? count : 0;
    }

    void dfs(String now, int depth) {
        if (now.equals(target)){
            if (depth < count) count = depth;
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (visit[i]) continue;
            int check = 0;
            for (int j = 0; j < now.length(); j++) {
                if (now.charAt(j) != words[i].charAt(j)) check++;
            }
            if (check == 1){
                visit[i] = true;
                dfs(words[i], depth+1);
                visit[i] = false;
            }
        }
    }
}