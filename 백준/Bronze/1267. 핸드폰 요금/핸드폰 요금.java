import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int y = 0;
        int m = 0;
        for (int i : a) {
            y += (i+1) / 30 * 10;
            if(((i+1)&30)!=0) y += 10;
            m += (i+1) / 60 * 15;
            if(((i+1)%60)!=0) m += 15;
        }
        if(y<m) System.out.println("Y " + y);
        else if (m<y) System.out.println("M " + m);
        else System.out.println("Y M " + y);
    }
}