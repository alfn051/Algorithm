import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int r = Integer.parseInt(br.readLine());
        for (int i = 0; i < r; i++) {
            String[] s = br.readLine().split(" ");
            bw.write(Integer.parseInt(s[0])+Integer.parseInt(s[1])+"\n");
        }
        bw.flush();
        bw.close();
    }
}