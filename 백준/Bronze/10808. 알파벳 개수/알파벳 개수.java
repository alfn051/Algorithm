import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] a=new int[26];
        String s=br.readLine();
        for(int i=0;i<s.length();i++)a[s.charAt(i)-'a']++;
        for(int i:a)System.out.print(i+" ");
    }
}