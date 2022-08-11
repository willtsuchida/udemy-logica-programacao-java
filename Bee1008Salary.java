import java.util.Scanner;

public class Bee1008Salary {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int horas = sc.nextInt();
       double valor = sc.nextDouble();
       double salary = horas * valor;
       System.out.println("NUMBER = " + number);
       System.out.printf("SALARY = U$ %.2f\n", salary);


    }
}
