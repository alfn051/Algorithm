import java.util.LinkedList;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        LinkedList<Integer> q = new LinkedList<>();
        for(int p : prices){
            q.offer(p);
        }
        int num = 0;
        while (!q.isEmpty()) {
            int poll = q.poll();
            answer[num] = 0;
            for (int i : q){
                answer[num]++;
                if(poll > i){
                    break;
                }
            }
            num++;
        }
        return answer;
    }
}