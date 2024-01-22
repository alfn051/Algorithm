import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        int[][] arr = new int[size][size];
        for(int i=0;i<size;i++){
            String str = br.readLine();
            for(int j=0;j<size;j++){
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        recursive(arr, sb);
        System.out.println(sb);
    }

    public static void recursive(int[][] arr, StringBuilder sb){
        int num = 2;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(num==2){num = arr[i][j];}
                if(num!=arr[i][j]){num=-1;}
            }
        }
        if(num==-1){
            sb.append("(");
            recursive(downsize(arr, 1), sb);
            recursive(downsize(arr, 2), sb);
            recursive(downsize(arr, 3), sb);
            recursive(downsize(arr, 4), sb);
            sb.append(")");
        }else {
            sb.append(num);
        }
    }

    public static int[][] downsize(int[][] arr, int quadrant){
        int length = arr.length/2;
        int[][] newArr = new int[length][length];
        int x=0, y=0;
        switch (quadrant){
            case 1:
                x=1;
                y=1;
                break;
            case 2:
                x=1;
                y=2;
                break;
            case 3:
                x=2;
                y=1;
                break;
            case 4:
                x=2;
                y=2;
                break;
        }
        for (int i = 0; i<length; i++){
            for (int j = 0; j<length; j++){
                newArr[i][j] = arr[i+length*(x-1)][j+length*(y-1)];
            }
        }
        return newArr;
    }
}