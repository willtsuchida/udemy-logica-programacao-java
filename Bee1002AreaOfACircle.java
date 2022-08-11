import java.util.Scanner;

public class Bee1002AreaOfACircle {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);

      double n = 3.14159;
      double raio = sc.nextDouble();
      double area = n * Math.pow(raio, 2.0);
      System.out.printf("A=%.4f\n", area);
    }
}
