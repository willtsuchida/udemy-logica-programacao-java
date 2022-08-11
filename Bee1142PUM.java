import java.util.Scanner;

public class Bee1142PUM {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1, b, c;

        for (int i = 1; i <= n; i++){

          b = a + 1;
          c = a + 2;

          System.out.printf("%d %d %d PUM\n", a, b, c);

          a = a+4;

          }
    }
}
