import java.util.Scanner;

public class Bee1009SalaryWithBonus {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String nome = sc.nextLine();
    double salario = sc.nextDouble();
    double vendas = sc.nextDouble();
    double total = salario + (vendas * 0.15);
    System.out.printf("TOTAL = R$ %.2f\n", total);
  }
}
