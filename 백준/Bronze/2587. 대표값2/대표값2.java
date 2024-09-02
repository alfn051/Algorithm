import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) a[i] = Integer.parseInt(br.readLine());
        Arrays.sort(a);
        System.out.println(Arrays.stream(a).sum()/a.length);
        System.out.println(a[2]);
    }
}