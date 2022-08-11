import java.util.Scanner;

public class Bee1118SeveralScoresWithValidation {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    double n1, n2, media;
    int continua = 1;

    do {
      continua--;

      n1 = sc.nextDouble();
      while (n1 > 10.0 || n1 < 0.0){
        System.out.println("nota invalida");
        n1 = sc.nextDouble();
      }
      n2 = sc.nextDouble();
      while (n2 > 10.0 || n2 < 0.0){
        System.out.println("nota invalida");
        n2 = sc.nextDouble();
      }

      media = (n1 + n2) / 2.0;

      System.out.printf("media = %.2f\n", media);

      while (continua > 2 || continua < 1) {
        System.out.println("novo calculo (1-sim 2-nao)");
        continua = sc.nextInt();
        if (continua == 2 || continua == 1) {
          break;
        }
      }
      if (continua == 2) {
        break;
      }
    } while (continua == 1);

  }
}
