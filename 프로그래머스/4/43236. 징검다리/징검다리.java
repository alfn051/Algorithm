import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        List<Integer> list = new ArrayList<>();
        list.add(rocks[0]);
        for (int i = 0; i < rocks.length - 1; i++) {
            list.add(rocks[i+1] - rocks[i]);
        }
        list.add(distance - rocks[rocks.length - 1]);
        int start = 0;
        int end = distance;

        while (start <= end) {
            int mid = (start + end) / 2;
            int count = 0;
            int size = 0;
            for (int i = 0; i < list.size(); i++) {
                size += list.get(i);
                if (size < mid) {
                    count++;
                }else {
                    size = 0;
                }
            }
            if (count > n){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }

        return start-1;
    }
}