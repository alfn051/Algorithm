import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] a=new int[10];
        String s=String.valueOf(Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()));
        for(int i=0;i<s.length();i++)a[s.charAt(i)-'0']++;
        for(int i:a)System.out.print(i+" ");
    }
}