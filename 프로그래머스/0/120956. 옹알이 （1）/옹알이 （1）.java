class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sa = {"aya", "ye", "woo", "ma"};
        for (String s : babbling) {
            String ns = s;
            for (String ss : sa) {
                ns = ns.replace(ss, " ");
            }
            if (ns.isBlank()) answer++;
        }
        return answer;
    }
}