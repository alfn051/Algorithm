import java.util.*;

class Solution {
    Queue<Integer> q = new PriorityQueue<>();

    public int[] solution(String[] operations) {
        for (String s : operations) {
            StringTokenizer st = new StringTokenizer(s);
            String t = st.nextToken();
            if (t.equals("I")) {
                insert(Integer.parseInt(st.nextToken()));
            } else if (t.equals("D")) {
                int n = Integer.parseInt(st.nextToken());
                if (n == -1) {
                    removeMin();
                } else {
                    removeMax();
                }
            }
        }
        if (q.isEmpty()) return new int[]{0, 0};

        int min = q.poll();
        int max;
        if (q.isEmpty()) {
            max = min;
        }else {
            Queue<Integer> dq = new PriorityQueue<>(Comparator.reverseOrder());
            dq.addAll(q);
            max = dq.poll();
        }

        int[] answer = {max, min};
        return answer;
    }

    void insert(int num) {
        q.offer(num);

    }

    void removeMin() {
        q.poll();
    }

    void removeMax() {
        Queue<Integer> dq = new PriorityQueue<>(Comparator.reverseOrder());
        dq.addAll(q);
        dq.poll();
        q.clear();
        q.addAll(dq);
    }
}