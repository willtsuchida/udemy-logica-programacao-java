import java.util.Scanner;

public class Bee1114FixedPassword {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int entrada = sc.nextInt();

        while (senha != entrada){
          System.out.println("Senha invalida");
          entrada = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

    }
}
