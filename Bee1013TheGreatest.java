import java.util.Scanner;

public class Bee1013TheGreatest {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int maiorAB = (a + b + Math.abs(a - b)) / 2;
    int maiorABouC = (c + maiorAB + Math.abs(c - maiorAB)) / 2;

    System.out.println(maiorABouC + " eh o maior");

  }
}
