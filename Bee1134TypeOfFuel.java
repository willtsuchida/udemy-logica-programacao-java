import java.util.Scanner;

public class Bee1134TypeOfFuel {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int alcool, gasolina, diesel, fim;
      fim = 0;
      int entrada = 0;
      alcool = 0;
      gasolina = 0;
      diesel = 0;

      while (fim != 4){
        entrada = sc.nextInt();
        if (entrada == 1){
          alcool++;
        } else if (entrada == 2){
          gasolina++;
        } else if(entrada == 3){
          diesel++;
        } else if (entrada == 4){
          break;
        }
      }
      System.out.println("MUITO OBRIGADO");
      System.out.printf("Alcool: %d\n",alcool);
      System.out.printf("Gasolina: %d\n",gasolina);
      System.out.printf("Diesel: %d\n",diesel);
    }
}


