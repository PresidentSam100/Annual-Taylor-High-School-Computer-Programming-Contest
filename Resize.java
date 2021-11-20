import java.util.Scanner;

public class Resize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int l = sc.nextInt();
            sc.next();
            int w = sc.nextInt();
            sc.next();
            int a = sc.nextInt();
            sc.next();
            int b = sc.nextInt();
            double x = (double)l/(double)w;
            double y = (double)w/(double)l;
            System.out.printf("%.2f by %.2f or %.2f by %.2f\n", (double)a, a*y, (double)b*x, (double)b);
        }

    }
}
