import java.util.Scanner;

public class Bee1061EventTime {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String s;

        s = sc.next();
        int diaInicio = sc.nextInt();
        int horaInicio = sc.nextInt();
        s = sc.next();
        int minutoInicio = sc.nextInt();
        s = sc.next();
        int segundoInicio = sc.nextInt();
        s = sc.next();
        int diaFim = sc.nextInt();
        int horaFim = sc.nextInt();
        s = sc.next();
        int minutoFim = sc.nextInt();
        s = sc.next();
        int segundoFim = sc.nextInt();

        System.out.println(diaFim - diaInicio-1 + " dia(s)");
        System.out.println(horaFim +24-horaInicio + " hora(s)");
        System.out.println(minutoFim-minutoInicio+" minuto(s)");
        System.out.println(segundoFim-segundoInicio+" segundo(s)");

    }
}
