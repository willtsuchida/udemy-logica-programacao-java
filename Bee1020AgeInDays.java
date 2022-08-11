import java.util.Scanner;

public class Bee1020AgeInDays {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int ano = x / 365;
        int meses = x % 365 / 30;
        int dias = x % 365 % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " meses(s)");
        System.out.println(dias + " dia(s)");


    }
}
