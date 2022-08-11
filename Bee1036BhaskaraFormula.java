import java.util.Scanner;

public class Bee1036BhaskaraFormula {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2.0) - (4.0 * a * c);
        double x1, x2;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        if (delta < 0.0 || a == 0.0){
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        } else {
            System.out.println("Impossivel calcular");
        }


    }
}
