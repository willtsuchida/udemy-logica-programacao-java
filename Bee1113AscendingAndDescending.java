import java.util.Scanner;

public class Bee-1113-AscendingAndDescending {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y){
          if (x < y){
            System.out.println("Crescente");
          } else {
            System.out.println("Decrescente");
          }
          x = sc.nextInt();
          y = sc.nextInt();
        }
    }
}
