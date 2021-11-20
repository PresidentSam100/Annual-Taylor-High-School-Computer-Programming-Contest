import java.util.Scanner;

public class taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble())
        {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double d = 0;
            if (a >= 0.2)
            {
                d += 0.5;
                a -= 0.2;
                d += a * 0.22*5;
            }
            else
            d += a * 0.5;

            d += b / 60 * 0.4;
            System.out.printf("$%.2f", d);
        }
        sc.close();
    }
}
