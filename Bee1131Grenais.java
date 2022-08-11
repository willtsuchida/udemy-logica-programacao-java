import java.util.Scanner;

public class Bee1131Grenais {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int qtdeGrenal = 0;
        int winInter = 0;
        int winGremio = 0;
        int empate = 0;
        int check = 1;
        int gol1, gol2;

        while (check == 1){
          gol1 = sc.nextInt();
          gol2 = sc.nextInt();

              if(gol1 > gol2){
                winInter++;
              } else if (gol1 < gol2){
                winGremio++;
              } else{
                empate++;
              }

              qtdeGrenal++;
              check = 0;

              while (check > 2 || check < 1 ){
                System.out.println("Novo grenal (1-sim 2-nao)");
                check = sc.nextInt();
              }
              if (check == 2){
                break;
              }
        }

        System.out.printf("%d grenais\n", qtdeGrenal);
        System.out.printf("Inter:%d\n", winInter);
        System.out.printf("Gremio:%d\n", winGremio);
        System.out.printf("Empates:%d\n", empate);
        if (winGremio > winInter){
          System.out.println("Gremio venceu mais");
        } else {
          System.out.println("Inter venceu mais");
        }

    }
}
