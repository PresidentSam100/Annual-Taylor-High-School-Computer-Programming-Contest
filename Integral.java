import java.util.Scanner;

public class Integral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            double ans = 0;
            double s = sc.nextDouble();
            double e = sc.nextDouble();
            double in = sc.nextDouble();
            for (double d = s; d < e; d+=in)
            {
                ans += (3 * d * d + 2 * d + 1) * in;
            }
            System.out.printf("%.6f\n",ans);
        }
    }
}
