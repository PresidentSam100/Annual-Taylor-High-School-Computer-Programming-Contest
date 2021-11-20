import java.util.Scanner;

public class flexjbox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int a = sc.nextInt();
            int b= sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            for (int k = 0; k < a; k++)
            {
                for (int l = 0; l < b; l++)
                {
                    if (k == r && l == c)
                        System.out.print("J");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
