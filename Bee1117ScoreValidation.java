import java.util.Scanner;

public class Bee1117ScoreValidation {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      double nota1, nota2;
      nota1 = sc.nextDouble();

      double notaMin = 0.0;
      double notaMax = 10.0;

      if (nota1 < notaMin || nota1 > notaMax){
        while(nota1 < notaMin || nota1 > notaMax){
          System.out.println("nota invalida");
          nota1 = sc.nextDouble();
        }
      }
      nota2 = sc.nextDouble();

      if (nota2 < notaMin || nota2 > notaMax){
        while(nota2 < notaMin || nota2 > notaMax){
          System.out.println("nota invalida");
          nota2 = sc.nextDouble();
        }
      }
      double media = (nota1+nota2)/2.0;
      System.out.printf("media = %.2f\n", media);
    }
}
