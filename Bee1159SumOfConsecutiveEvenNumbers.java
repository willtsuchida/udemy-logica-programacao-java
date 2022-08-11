import java.util.Scanner;

public class Bee1159SumOfConsecutiveEvenNumbers {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int input = 0;
        int soma = 0;

        do {
          input = sc.nextInt();
          if (input == 0){
          break;
          } else if (input % 2 == 0){
            soma = input + input+2 + input+4 + input+6 + input+8;
          } else {
            soma = input+1 + input+3 + input+5 + input+7 + input+9;
          }
          System.out.println(soma);
        }while (input != 0);

        }

}