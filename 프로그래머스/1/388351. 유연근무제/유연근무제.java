import java.util.*;
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        
        int[] emp = new int[schedules.length];
        
        for(int i = 0; i < emp.length; i++){
            for(int j = 0; j < 7; j++){
                if((startday+j)%7 == 6 || startday+j == 7) continue;
                if(m(schedules[i])+10 < m(timelogs[i][j])) emp[i] = -1;
            }
        }
        return Arrays.stream(emp).sum()+emp.length;
    }
    int m(int tm){
        return tm/100*60+tm%100;
    }
}