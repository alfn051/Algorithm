import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        for (long i = Long.min(a[0], a[1])+1; i < Long.max(a[0], a[1]); i++) {
            cnt++;
            sb.append(i).append(" ");
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}