import java.util.Scanner;

public class Vowely {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            String s = sc.next();
            int vowel = 0;
            for (int j = 0; j < s.length(); j++)
            {
                if ("aeiou".contains(s.substring(j,j+1)))
                    vowel++;
            }
            if (vowel * 2 >= s.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
