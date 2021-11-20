import java.util.Scanner;

public class Taxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            double d  = sc.nextDouble();
            System.out.printf("$%.2f\n", d*1.0825);
        }
    }
}
