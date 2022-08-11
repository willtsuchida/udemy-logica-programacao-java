
import java.util.Scanner;

public class Bee1046GameTime {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int tempoTotal;

        if (b<a){
          tempoTotal = 24- a + b;
        } else if (a == b){
          tempoTotal = 24;
        }
        else {
          tempoTotal = b - a;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", tempoTotal);

    }
}
