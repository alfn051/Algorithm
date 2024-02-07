import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answerList = new ArrayList<>();
        for (int[] command : commands) {
            int[] arr = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(arr);
            answerList.add(arr[command[2]-1]);
        }

        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}