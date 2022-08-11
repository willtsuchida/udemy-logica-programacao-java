import java.util.Scanner;

public class Bee1094Experiments {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int tentativas = sc.nextInt();
        int totalcobaias, somaCobaias=0, coelhos=0, ratos=0, sapos=0;
        char escolha;
        for (int i = 1; i <= tentativas; i++){
          totalcobaias = sc.nextInt();
          escolha = sc.next().charAt(0);
          somaCobaias= somaCobaias + totalcobaias;
          if (escolha == 'C'){
              coelhos = coelhos + totalcobaias;
          }else if (escolha == 'R'){
            ratos = ratos + totalcobaias;
          } else{
            sapos = sapos + totalcobaias;
          }
        }
        System.out.printf("Total: %d cobaias\n",somaCobaias);
        System.out.printf("Total de coelhos: %d\n",coelhos);
        System.out.printf("Total de ratos: %d\n",ratos);
        System.out.printf("Total de sapos: %d\n",sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n",((double)(coelhos)/(double)(somaCobaias))*100.0);
        System.out.printf("Percentual de ratos: %.2f %%\n",((double)(ratos)/(double)(somaCobaias))*100.0);
        System.out.printf("Percentual de sapos: %.2f %%\n",((double)(sapos)/(double)(somaCobaias))*100.0);
    }
}
