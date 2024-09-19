import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("push")) {
                a[h++] = Integer.parseInt(s[1]);
            } else if (s[0].equals("pop")) {
                if(h<=0) bw.write(-1+"\n");
                else bw.write(a[h---1]+"\n");
            } else if (s[0].equals("size")) {
                bw.write(h+"\n");
            } else if (s[0].equals("empty")) {
                if(h<=0) bw.write(1+"\n");
                else bw.write(0+"\n");
            } else {
                if(h<=0) bw.write(-1+"\n");
                else bw.write(a[h - 1]+"\n");
            }
        }
        bw.flush();
    }

    static int[] a = new int[10000];
    static int h = 0;
}