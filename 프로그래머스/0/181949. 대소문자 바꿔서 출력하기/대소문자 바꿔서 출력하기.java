import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next().chars().map(c -> c >= 'a' ? c - 32 : c + 32).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()));
    }
}