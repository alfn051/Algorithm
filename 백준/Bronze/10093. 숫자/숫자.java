import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = Integer.min(a[0], a[1])+1; i < Integer.max(a[0], a[1]); i++) {
            cnt++;
            sb.append(i).append(" ");
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}