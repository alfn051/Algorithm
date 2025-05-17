import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve(sc.nextInt());
        }
    }

    static void solve(int n) {
        int[] m2 = new int[]{1, 0};
        int[] m1 = new int[]{0, 1};

        if (n == 0){
            System.out.println(m2[0] + " " + m2[1]);
            return;
        }
        if (n == 1) {
            System.out.println(m1[0] + " " + m1[1]);
            return;
        }

        for (int i = 2; i <= n; i++) {
            int[] temp = new int[]{m1[0] + m2[0], m1[1] + m2[1]};
            m2 = m1;
            m1 = temp;
        }

        System.out.println(m1[0] + " " + m1[1]);

    }
}