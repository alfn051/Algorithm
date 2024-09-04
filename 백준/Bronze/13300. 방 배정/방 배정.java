import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] g = new int[2][6];
        for (int i = 0; i < nk[0]; i++) {
            String[] s = br.readLine().split(" ");
            g[Integer.parseInt(s[0])][Integer.parseInt(s[1])-1]++;
        }
        int c = 0;
        for(int[] a : g){
            for(int i : a){
                c+=i/nk[1];
                if(i%nk[1]>0) c++;
            }
        }
        System.out.println(c);
    }
}