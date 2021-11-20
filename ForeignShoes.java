import java.util.Scanner;

public class ForeignShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            String a = sc.next();
            String b = sc.next();
            int x = sc.nextInt();
            if(a.equals("Women"))
            {
                if(b.equals("US"))
                {
                    System.out.println(a+" UK "+(x-2));
                }
                else
                {
                    System.out.println(a+" US "+(x+2));
                }
            }
            else
            {
                if(b.equals("US"))
                {
                    System.out.println(a+" UK "+(x-1));
                }
                else
                {
                    System.out.println(a+" US "+(x+1));
                }
            }
        }
    }
}
