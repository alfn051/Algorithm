class Solution {

    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            answer += Math.abs(Math.abs((int) name.charAt(i) - 78) - 13);
            if (i < name.length() - 1 && name.charAt(i + 1) == 'A') {
                int a = i + 1;
                while (a < name.length() && name.charAt(a) == 'A') {
                    a++;
                }
                move = Math.min(move, i*2+name.length()-a);
                move = Math.min(move, i + 2 * (name.length() - a));
            }
        }

        return answer+move;
    }
}