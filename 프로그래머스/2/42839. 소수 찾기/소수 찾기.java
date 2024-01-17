import java.lang.Math;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
class Solution {
    String[] numArr;
    boolean[] visited;
    Set<Integer> result = new HashSet<>();
    boolean[] arr;
    public int solution(String numbers) {
        numArr = numbers.split("");
        visited = new boolean[numbers.length()];
        permutation(0, "", numbers.length());
        int n = Collections.max(result);
        arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(arr[i]) continue;
            for(int j = i*2; j <= n; j+=i) arr[j] = true;
        }
        int answer = 0;
        for(int i:result){
            if(!arr[i]) answer++;
        }
        return answer;
    }


    public void permutation(int cnt, String num, int length){
        if(cnt != 0) result.add(Integer.parseInt(num));
        if(cnt == length) return;
        for (int i = 0; i < length; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            permutation(cnt+1, num + numArr[i], length);
            visited[i] = false;
        }
    }
}