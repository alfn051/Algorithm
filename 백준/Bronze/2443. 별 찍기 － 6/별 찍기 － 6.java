import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int r = Integer.parseInt(br.readLine());
        for(int i=r;i>=1;i--){
            StringBuilder sb = new StringBuilder();
            sb.append(" ".repeat(((r*2-1)-(i*2-1))/2));
            sb.append("*".repeat(i*2-1));
            bw.write(sb+"\n");
        }
        bw.flush();
        bw.close();
    }
}