import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        LinkedList<Integer> pq = new LinkedList<>();
        LinkedList<Integer> lq = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);
            lq.offer(i);
        }
        int answer = 0;
        while (!pq.isEmpty()) {
            int p = pq.poll();
            int l = lq.poll();
            boolean b = true;
            for (int i = 0; i < pq.size(); i++) {
                if (p < pq.get(i)) {
                    b = false;
                    break;
                }
            }
            if(b){
                answer++;
                if (l == location) {
                    return answer;
                }
            }else {
                pq.offer(p);
                lq.offer(l);
            }
        }
        return answer;
    }
}