import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]){
                    reserve[j] = -1;
                    lost[i] = -1;
                }
            }
        }
        for (int l : lost) {
            if (l<0) continue;
            boolean chk = false;
            for (int i = 0; i<reserve.length; i++) {
                if (l - 1 == reserve[i]) {
                    reserve[i] = -1;
                    chk = true;
                    break;
                } else if (l + 1 == reserve[i]) {
                    reserve[i] = -1;
                    chk = true;
                    break;
                }
            }
            if (!chk) n--;
        }
        return n;
    }
}