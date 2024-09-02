import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n%2!=0) ans.add(n);
        }
        if(ans.isEmpty()) System.out.println(-1);
        else {
            System.out.println(ans.stream().mapToInt(i->i).sum());
            System.out.println(ans.stream().min(Integer::compareTo).get());
        }
    }
}