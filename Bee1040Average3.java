import java.util.Scanner;

public class Bee1040Average3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float exame;

        float media = (a*2 + b*3 + c*4 + d*1) / 10;

        System.out.printf("Media: %.1f\n", media);
        if (media > 7.0){
          System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0){
          System.out.println("Aluno reprovado.");
        }
        else{
          System.out.println("Aluno em exame.");
          exame = sc.nextFloat();
          System.out.printf("Nota do exame: %.1f\n", exame);
              if((media+exame)/2 >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", ((media+exame)/2));
              } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", ((media+exame)/2));
              }
        }
    }
}
