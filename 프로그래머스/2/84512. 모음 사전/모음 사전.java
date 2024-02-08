class Solution {
    String[] words = {"A","E","I","O","U"};
    int[] visit = {0,0,0,0,0};
    int count = 0;
    int answer;
    public int solution(String word) {
        permutation(word, "");
        return answer;
    }
    void permutation(String find, String w) {
        System.out.println(w + count);
        if (w.equals(find)) answer = count;
        if (w.length()>=5) return;
        for (int i = 0; i < 5; i++) {
            if (visit[i] <= 5){
                visit[i]++;
                count++;
                permutation(find, w+words[i]);
                visit[i]--;
            }
        }
    }
}