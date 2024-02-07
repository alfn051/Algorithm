import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        PriorityQueue<int[]> rq = new PriorityQueue<>(((o1, o2) -> o1[0] - o2[0]));
        PriorityQueue<int[]> tq = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        int time = 0;
        int delay = 0;
        Arrays.stream(jobs).forEach(rq::offer);
        while (!rq.isEmpty()){
            int finalTime = time;
            rq.stream().sorted(((o1, o2) -> o1[0] - o2[0])).forEach(ints -> {
                if (ints[0] <= finalTime) {
                    tq.offer(rq.poll());
                }
            });
            if(tq.isEmpty()){
                time++;
            }else {
                int[] job = tq.poll();
                delay += time - job[0] + job[1];
                time += job[1];
                while (!tq.isEmpty()) {
                    rq.offer(tq.poll());
                }
            }
        }

        int answer = delay / jobs.length;
        return answer;
    }
}