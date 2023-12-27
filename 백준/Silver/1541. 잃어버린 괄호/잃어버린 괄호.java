import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, "-");
        int ans = 0;
        StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
        while (st2.hasMoreTokens()){
            ans += Integer.parseInt(st2.nextToken());
        }

        while (st.hasMoreTokens()){
            StringTokenizer st3 = new StringTokenizer(st.nextToken(), "+");
            int a = 0;
            while (st3.hasMoreTokens()){
                a += Integer.parseInt(st3.nextToken());
            }
            ans -= a;
        }
        System.out.println(ans);
    }
}