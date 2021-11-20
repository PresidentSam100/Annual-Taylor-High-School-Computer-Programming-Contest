import java.util.Scanner;

public class Taxation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double ans=0;
        for (int i = 0; i < N; i++)
        {
            if(sc.hasNextDouble())
            {
                ans+=sc.nextDouble();
            }
            else
            {
                sc.next();
                double d = sc.nextDouble();
                ans+=d+d*.0825;
            }
        }
        System.out.printf("The total is $%.2f", ans);
    }
}
