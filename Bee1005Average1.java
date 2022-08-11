import java.util.Scanner;

public class Bee1005Average1 {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      double a = sc.nextDouble();
      double b = sc.nextDouble();

      double media = (a * 3.5 + b * 7.5) / 11.0;



      System.out.printf("MEDIA = %.5f\n", media);
    }
}
