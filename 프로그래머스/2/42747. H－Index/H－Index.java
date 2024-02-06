import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = Math.max(Math.min(i+1, arr[i]), answer);
        }
        return answer;
    }
}