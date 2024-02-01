import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            if (!map.containsKey(p)) {
                map.put(p, 1);
            } else {
                map.replace(p, map.get(p) + 1);
            }
        }
        for (String s : completion) {
            if(map.containsKey(s)){
                if(map.get(s)<=1){
                    map.remove(s);
                }else{
                    map.replace(s, map.get(s) - 1);
                }
            }
        }
        Set<String> set = map.keySet();
        String key = "";
        for (String k : set) {
            key = k;
        }
        return key;
    }
}