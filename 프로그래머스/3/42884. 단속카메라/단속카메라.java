import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        LinkedList<int[]> list = new LinkedList<>(Arrays.asList(routes));
        list.sort(((o1, o2) -> o1[1] - o2[1])); //탈출지점 빠른순대로 정렬
        int answer = 1;
        int camera = list.getFirst()[1];
        while (!list.isEmpty()) {
            int[] car = list.poll();
            if (car[0] > camera){
                camera = car[1];
                answer++;
            }
        }

        return answer;
    }
}