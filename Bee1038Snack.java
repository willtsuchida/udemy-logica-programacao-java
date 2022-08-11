import java.util.Locale;
import java.util.Scanner;

public class Bee1038Snack {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    int cod = sc.nextInt();
    int qtde = sc.nextInt();

    switch (cod) {
      case 1:
        System.out.printf("Total: R$ %.2f\n", (qtde * 4.0));
        break;
      case 2:
        System.out.printf("Total: R$ %.2f\n", (qtde * 4.50));
        break;
      case 3:
        System.out.printf("Total: R$ %.2f\n", (qtde * 5.0));
        break;
      case 4:
        System.out.printf("Total: R$ %.2f\n", (qtde * 2.0));
        break;
      case 5:
        System.out.printf("Total: R$ %.2f\n", (qtde * 1.50));
        break;

    }

  }
}
