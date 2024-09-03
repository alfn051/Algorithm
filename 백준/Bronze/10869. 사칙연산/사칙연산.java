import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(num[0]+num[1]+"\n");
        bw.write(num[0]-num[1]+"\n");
        bw.write(num[0]*num[1]+"\n");
        bw.write(num[0]/num[1]+"\n");
        bw.write(num[0]%num[1]+"");
        bw.flush();
        bw.close();
    }
}