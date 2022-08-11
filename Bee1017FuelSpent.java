import java.util.Scanner;

public class Bee1017FuelSpent{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int kml = 12;
        int tempo = sc.nextInt();
        int vMedia = sc.nextInt();


        double consumo = (tempo * vMedia) / (double) kml;


      System.out.printf("%.3f\n", consumo);
    }
}
