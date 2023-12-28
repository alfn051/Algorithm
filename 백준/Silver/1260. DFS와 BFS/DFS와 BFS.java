import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] visit;
    static int node;
    static int line;
    static int start;
    static int count;
    static Queue<Integer> queue = new LinkedList<>();

    public static void dfs(int start){
        visit[start] = true;
        System.out.print(start + " ");
        if (count >= node) return;
        count++;
        for (int i = 1; i <= node; i++) {
            if (arr[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        queue.offer(start);
        System.out.print(start + " ");
        visit[start] = true;
        while( !queue.isEmpty() ) {
            start = queue.poll();

            for(int i=1; i<=node; i++) {

                if(arr[start][i] == 1 && !visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        arr = new int[node +1][node +1];
        visit = new boolean[node +1];
        for (int i = 0; i < line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }
        dfs(start);
        System.out.println();
        visit = new boolean[node + 1];
        bfs(start);
    }
}