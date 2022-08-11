import java.util.Scanner;

public class Bee1158SumOfConsecutiveOddNumbers3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int tent = sc.nextInt();
        int x, y;

        int soma = 0;

        for (int j = 1; j<=tent; j++){

          x = sc.nextInt();
          y = sc.nextInt();

          for (int i = 0; i < y; i++){
              // x = 4
              if (x % 2 == 0){
              soma = soma + x + 1;
              } else {
                soma = soma + x;
              }
              x = x + 2;


          }
          System.out.println(soma);
          soma = 0;
        }
    }
}
