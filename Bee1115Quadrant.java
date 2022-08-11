import java.util.Scanner;

public class Bee1115Quadrant {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0){
        if (x > 0 && y > 0){
          System.out.println("primeiro");
          x = sc.nextInt();
          y = sc.nextInt();
        } else if (x < 0 && y > 0){
          System.out.println("segundo");
          x = sc.nextInt();
          y = sc.nextInt();
        } else if ( x < 0 && y < 0){
          System.out.println("terceiro");
          x = sc.nextInt();
          y = sc.nextInt();
        } else {
          System.out.println("quarto");
          x = sc.nextInt();
          y = sc.nextInt();
        }
      }
    }
}
