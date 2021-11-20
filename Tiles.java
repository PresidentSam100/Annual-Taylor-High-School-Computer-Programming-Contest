import java.util.Scanner;

public class Tiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double d = a*b;
            d*=1.1;
            if(a%10==0 || b%10==0)
                System.out.println((int)d);
            else
            System.out.println((int)(Math.ceil(d)));
        }
    }
}
