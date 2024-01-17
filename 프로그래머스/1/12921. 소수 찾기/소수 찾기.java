class Solution {
    public int solution(int n) {
        boolean[] arr = new boolean[n+1];
        arr[1] = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(arr[i]) continue;
            for(int j = i*2; j <= n; j+=i) arr[j] = true;
        }
        int answer = 0;
        for(int i = 2; i <= n; i++) if(!arr[i]) answer++; 
        return answer;
    }
}