import java.util.Scanner;

public class KoolAid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int a = sc.nextInt();
            int l = a / 4;
            a %= 4;
            int m = a / 2;
            a %= 2;
            int s = a;
            if (l != 0)
                System.out.print(l + " large ");
            if (m != 0)
                System.out.print(m + " medium ");
            if (s != 0)
                System.out.print(s + " small ");
            System.out.println();
        }
    }
}
