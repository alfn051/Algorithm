import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        String[] arr = bf.readLine().split(" ");
        Arrays.sort(arr, (o1, o2) -> {
            String case1 = o1 + o2;
            String case2 = o2 + o1;
            return case2.compareTo(case1);
        });
        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }
        String ans = answer.toString();
        if (ans.replaceAll("0", "").isEmpty()) {
            System.out.println("0");
        }else {
            System.out.println(ans);
        }
    }
}