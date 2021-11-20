import java.util.Scanner;

public class MalFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double d = sc.nextDouble();
            double x = a * d * d + b * d + c;
            System.out.printf("%.3f\n", x            );
        }
    }
}
