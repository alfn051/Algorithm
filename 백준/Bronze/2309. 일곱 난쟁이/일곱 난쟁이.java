import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            l.add(Integer.parseInt(br.readLine()));
        }
        l.sort(Integer::compareTo);
        int sum = l.stream().mapToInt(i -> i).sum();
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if((sum - 100) == (l.get(i) + l.get(j))){
                    l.remove(j);
                    l.remove(i);
                    l.forEach(System.out::println);
                    return;
                }
            }
        }

    }
}