import java.util.Scanner;

public class Bee1101SequenceOfNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int maior = x, menor = y;
        int soma=0;

        while (x != 0 || y != 0){
          if (x<y){
            maior =y;
            menor = x;
          }
            for (int i = menor; i<=maior; i++){
              System.out.print(i + " ");
              soma = soma + i;
            }
            System.out.printf("sum=%d",soma);
            x = sc.nextInt();
            y = sc.nextInt();
       }
       sc.close();
    }
}
