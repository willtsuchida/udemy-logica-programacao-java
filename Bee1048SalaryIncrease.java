import java.util.Scanner;
public class Bee1048SalaryIncrease {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double salario, reajuste, percentual;

        salario = sc.nextDouble();

        if (salario <= 400.0){
            reajuste = salario * 15.0 / 100.0;
            percentual = 15;
        }
        else if ( salario >= 400.01 && salario <= 800.0){
          reajuste = salario * 12.0 / 100.0;
          percentual = 12;
        }
        else if (salario >= 800.01 && salario <= 1200.0){
          reajuste = salario * 10.0 / 100.0;
          percentual = 10;
        }
        else if (salario >= 1200.01 && salario <= 2000.0){
          reajuste = salario * 7.0 / 100.0;
          percentual = 7;
        }
        else {
          reajuste = salario * 4.0 / 100.0;
          percentual = 4;
        }

        System.out.printf("Novo salario: %.2f\n", (salario+reajuste));
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + (int)percentual +" %");
    }
}
