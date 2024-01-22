import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int aaa = sc.nextInt();
        if(aaa>=90){
            System.out.println("A");
        }else if(aaa>=80){
            System.out.println("B");
        }else if(aaa>=70){
            System.out.println("C");
        }else if(aaa>=60){
            System.out.println("D");
        }else{System.out.println("F");}
    }
}