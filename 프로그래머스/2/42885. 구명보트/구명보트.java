import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : people) list.add(i);
        Collections.sort(list);
        int count = 0;
        while (!list.isEmpty()) {
            int big = list.getLast();
            int small = list.getFirst();
            if (list.size() > 1 && big + small <= limit) {
                list.removeFirst();
            }
            list.removeLast();
            count++;
        }

        return count;
    }
}