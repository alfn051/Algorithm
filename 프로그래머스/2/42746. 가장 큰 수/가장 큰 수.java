import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        Integer[] arr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (o1, o2) -> {
            int case1 = Integer.parseInt("" + o1 + o2);
            int case2 = Integer.parseInt("" + o2 + o1);
            if (case1 > case2) return -1;
            if (case1 < case2) return 1;
            return 0;
        });
        StringBuilder answer = new StringBuilder();
        for (int i : arr) {
            answer.append(i);
        }
        String ans = answer.toString();
        if (ans.replaceAll("0", "").isEmpty()) {
            return "0";
        }

        return ans;
    }
}