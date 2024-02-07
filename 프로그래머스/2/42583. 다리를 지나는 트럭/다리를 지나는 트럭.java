import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        LinkedList<Integer> bridge = new LinkedList<>();
        LinkedList<Integer> trucks = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        for (int i : truck_weights) {
            trucks.offer(i);
        }
        int answer = 0;
        while (!trucks.isEmpty()) {
            bridge.poll();
            answer++;
            if (bridge.stream().mapToInt(i -> i).sum() + trucks.peek() <= weight) {
                bridge.offer(trucks.poll());
            }else {
                bridge.offer(0);
            }
        }
        while (!bridge.isEmpty()) {
            bridge.poll();
            answer++;
        }
        return answer;
    }
}