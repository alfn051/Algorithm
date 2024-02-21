import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long end = (long) times[times.length - 1] * n;
        long start = 0;
        long answer = end;

        while (start <= end) {
            long mid = (end + start) / 2;
            long count = 0;
            for (int i : times) {
                count += mid / i;
            }
            if (count == n) {
                if (mid < answer){
                    answer = mid;
                    end = mid - 1;
                }else break;
            } else if (count > n) {
                end = mid - 1;
                if (mid < answer) answer = mid;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }
}