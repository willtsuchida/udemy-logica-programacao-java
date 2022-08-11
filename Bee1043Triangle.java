import java.util.Scanner;

public class Bee1043Triangle {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int contador = sc.nextInt();
        int num = 1;

        for (int j = 1; j <= contador; j++){

          System.out.printf("%d %d %d\n", num, (int)Math.pow(num, 2), (int)Math.pow(num, 3));
          num++;

        }
    }
}
