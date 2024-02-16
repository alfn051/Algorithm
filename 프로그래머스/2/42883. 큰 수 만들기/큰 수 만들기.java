import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Integer> stack = new Stack<>();
        int count =0;
        stack.push((int)number.charAt(0) - 48);
        for (int i = 1; i < number.length(); i++) {
            int num = (int)number.charAt(i) - 48;
            int peek = stack.peek();
            while (count<k && peek < num && !stack.isEmpty()) {
                stack.pop();
                peek = stack.isEmpty()? peek : stack.peek();
                count++;
            }
            stack.push(num);
        }
        while (count < k) {
            stack.pop();
            count++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : stack.stream().mapToInt(i -> i).toArray()) {
            sb.append(i);
        }
        return sb.toString();
    }
}