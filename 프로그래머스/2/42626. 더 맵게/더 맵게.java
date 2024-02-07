import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.stream(scoville).forEach(pq::offer);
        int answer = 0;
        try {
            while (true) {
                int min = pq.poll();
                if (min >= K) {
                    break;
                }
                int n = min + pq.poll() * 2;
                pq.offer(n);
                answer++;
            }
        } catch (Exception e) {
            return -1;
        }
        return answer;
    }
}