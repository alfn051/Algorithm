import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        Map<Integer, Integer> attackMap = new HashMap<>();
        for (int[] i : attacks) {
            attackMap.put(i[0], i[1]);
        }
        int time = Collections.max(attackMap.keySet());
        int curHealth = health;
        int cons = 0;
        for (int i = 1; i <= time; i++) {
            Integer attack = attackMap.get(i);
            if (attack == null) {
                cons++;
                curHealth += bandage[1];
                if(cons >= bandage[0]){
                    curHealth += bandage[2];
                    cons = 0;
                }
                if(curHealth >= health) curHealth = health;
            }else {
                cons = 0;
                curHealth -= attack;
                if(curHealth <= 0) return -1;
            }
        }
        return curHealth;
    }
}