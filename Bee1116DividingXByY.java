import java.util.Scanner;

public class Bee1116DividingXByY {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tentativas = sc.nextInt();

        for (int i = 0; i < tentativas; i++){
          int ent1, ent2;
          ent1 = sc.nextInt();
          ent2 = sc.nextInt();
            if (ent2 == 0.0){
              System.out.println("divisao impossivel");
            } else {
              System.out.println((double)(ent1)/(double)(ent2));
            }
        }
    }
}
