import java.util.Scanner;

public class Bee1132MultiplesOf13 {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int somax = 0;
    int menor = x;
    int maior = y;

        if(x>y){
          maior = x;
          menor = y;
        }

        for (int i = menor; i <= maior; i++) {
          if (i % 13 != 0) {
            somax = somax + i;
          }
        }
    System.out.println((somax));
    sc.close();
  }
}
