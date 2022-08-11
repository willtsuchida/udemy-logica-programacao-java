import java.util.Scanner;

public class Bee1078MultiplicateTable {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        for (int i = 1; i<11 ; i++){
            System.out.printf("%d x %d = %d\n", i , N, (N*i));

        }
    }
}
