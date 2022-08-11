import java.util.Locale;
import java.util.Scanner;

public class Bee1079WeightedAverages {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        int qtde = sc.nextInt();

        for (int i = 0; i<qtde; i++){
            double n1, n2, n3, media;
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            media = ((n1*2.0)+(n2*3.0)+(n3*5.0))/10.0;
            System.out.printf("%.1f\n", media);
        }
    }
}
