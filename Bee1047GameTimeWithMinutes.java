import java.util.Scanner;

public class Bee1047GameTimeWithMinutes {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int tempoTotal;
      int minTotal;

      if (c<a){
        tempoTotal = 24- a + c;
      } else if (a == c){
        tempoTotal = 24;
      }
      else {
        tempoTotal = c - a;
      }
      if (d<b){
        minTotal = 60- b + d;
      } else if (b == d){
        minTotal = 24;
      }
      else {
        minTotal = d - a;
      }

      System.out.printf("O JOGO DUROU %d HORA(S) e %d MINUTO(S)\n", tempoTotal, minTotal);

    }
}
