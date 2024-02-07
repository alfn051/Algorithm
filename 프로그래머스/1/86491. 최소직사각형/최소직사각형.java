import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for (int[] size : sizes) {
            Arrays.sort(size);
            if (size[0] > w) w = size[0];
            if (size[1] > h) h = size[1];
        }
        return w * h;
    }
}