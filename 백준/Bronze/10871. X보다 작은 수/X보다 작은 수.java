import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine().split(" ")[1]);
        String[] nums = br.readLine().split(" ");
        for (String s : nums) {
            if(Integer.parseInt(s) < x) System.out.print(s + " ");
        }
    }
}