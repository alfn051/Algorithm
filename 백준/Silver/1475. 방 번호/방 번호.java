import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] a=new int[10];
        String s = br.readLine();
        for(int i=0;i<s.length();i++)a[s.charAt(i)-'0']++;
        a[6]=(int)(a[6]+a[9]+1)/2;
        a[9]=0;
        System.out.println(Arrays.stream(a).max().getAsInt());
    }
}