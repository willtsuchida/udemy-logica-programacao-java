import java.util.Scanner;

public class Bee1154Ages {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        double media = 0.0;
        double cont = 0.0;
        double somaidades = 0.0;

        while (idade >= 0){
          idade = sc.nextInt();
          if (idade >=0){
          somaidades += idade;
          cont++;
          }
        }
        System.out.printf("%.2f\n",(somaidades/cont));
    }
}
