import java.util.Scanner;

public class Bee1019TimeConversion {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //entrada em segundos

        int hora = n / 3600;
        int minuto = n % 3600 / 60;
        int segundo = n % 3600 % 60;

        System.out.printf("%d:%d:%d\n", hora, minuto, segundo);
    }
}
