import java.util.Locale;
import java.util.Scanner;

public class Bee1014Consumption{
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double km = X / Y;

        System.out.printf("%.3f km/l\n", km);
    }
}
