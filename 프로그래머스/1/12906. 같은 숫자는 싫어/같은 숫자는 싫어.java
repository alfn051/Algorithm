import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> s = new Stack<>();
        for (int i : arr) {
            if (s.empty()||s.peek()!=i) s.push(i);
        }
        int[] answer = s.stream().mapToInt(i -> i).toArray();

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}