import java.util.Scanner;

public class Bee1153SimpleFactorial {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;

        for (int i = 1; i <= n; i++){
            x = x * i;
        }

        System.out.println(x);

    }
}
