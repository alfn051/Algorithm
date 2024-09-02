import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] c=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<10;i++){
            int[] r=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j=0;j<(r[1]-r[0]+1)/2;j++){
                int t=c[r[0]+j];
                c[r[0]+j]=c[r[1]-j];
                c[r[1]-j]=t;
            }
        }
        for(int i=1;i<21;i++){
            System.out.printf(c[i]+" ");
        }
    }
}