import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correct = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) correct[0]++;
            if (answers[i] == two[i % 8]) correct[1]++;
            if (answers[i] == three[i % 10]) correct[2]++;
        }
        List<Integer> answer = new ArrayList<>();
        int max = Arrays.stream(correct).max().getAsInt();
        if (correct[0] == max) answer.add(1);
        if (correct[1] == max) answer.add(2);
        if (correct[2] == max) answer.add(3);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}