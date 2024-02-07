import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int w = 0;
        int h = 0;
        for (int i = 3; i < (int) Math.sqrt(sum) + 1; i++) {
            if (sum % i != 0) continue;
            int tw = sum / i;
            if ((tw - 2) * (i -2) == yellow){
                w = tw;
                h = i;
                break;
            }
        }
        return new int[]{w, h};
    }
}