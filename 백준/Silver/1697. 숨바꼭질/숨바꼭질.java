import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int subin = Integer.parseInt(st.nextToken());
        int bro = Integer.parseInt(st.nextToken());
        int size = 100001;
        int[] map = new int[size];
        LinkedList<Integer> q = new LinkedList<>();
        map[subin] = 1;
        q.offer(subin);
        while (!q.isEmpty()) {
            int now = q.poll();
            if (now == bro) {
                break;
            }
            if (now + 1 < size && map[now + 1] == 0) {
                q.offer(now + 1);
                map[now + 1] = map[now] + 1;
            }
            if (now - 1 >= 0 && map[now - 1] == 0) {
                q.offer(now - 1);
                map[now - 1] = map[now] + 1;
            }
            if (now * 2 < size && map[now * 2] == 0) {
                q.offer(now * 2);
                map[now * 2] = map[now] + 1;
            }
        }
        System.out.println(map[bro] - 1);
    }
}
