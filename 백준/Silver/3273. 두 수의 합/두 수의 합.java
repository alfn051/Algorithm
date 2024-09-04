import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[st.countTokens()];
        int idx = 0;
        while (st.hasMoreTokens()){
            a[idx++] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        int p1 = 0;
        int p2 = a.length-1;
        while (p1 < p2) {
            int sum = a[p1] + a[p2];
            if(sum==x) {
                cnt++;
                p1++;
            }
            else if(sum > x) p2--;
            else p1++;
        }

        System.out.println(cnt);
    }
}