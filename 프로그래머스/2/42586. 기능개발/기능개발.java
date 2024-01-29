import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Progress> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            q.offer(new Progress(progresses[i], speeds[i]));
        }
        List<Integer> answer = new ArrayList<>();
        while (!q.isEmpty()) {
            int time = (int)Math.ceil((double) (100 - q.peek().value) /q.peek().speed);
            q.forEach(p -> p.value = p.value+p.speed*time);
            int count = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                if(q.peek().value>=100){
                    q.poll();
                    count++;
                }else break;
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}

class Progress{
    int value;
    int speed;
    public Progress(int value, int speed) {
        this.value = value;
        this.speed = speed;
    }
}