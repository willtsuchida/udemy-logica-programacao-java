import java.util.Scanner;

public class Bee1010SimpleCalculate {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        double c1 = sc.nextDouble();

        double valor = b * c;
        double valor1 = b1 * c1;


      System.out.printf("VALOR A PAGAR: R$ %.2f\n", (valor+valor1));
    }
}
