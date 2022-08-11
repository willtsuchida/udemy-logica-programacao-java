import java.util.Scanner;

public class Bee1067OddNumbers {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i = i+2){
          System.out.println(i);
        }
    }
}
