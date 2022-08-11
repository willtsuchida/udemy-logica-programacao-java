import java.util.Scanner;

public class Bee1072Interval {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input, in = 0, out=0;
        for (int i = 0; i<n; i++){
          input = sc.nextInt();
            if (input >= 10 && input <=20){
              in++;
            } else{
              out++;
            }
        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);

    }
}
