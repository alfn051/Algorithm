import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] s : clothes) {
            if(!map.containsKey(s[1])){
                map.put(s[1], 1);
            }else {
                map.replace(s[1], map.get(s[1]) + 1);
            }
        }
        int answer = 1;
        for (int i : map.values()) {
            answer *= i + 1;
        }
        answer -= 1;
        return answer;
    }
}