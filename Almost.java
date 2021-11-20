import java.util.Scanner;

public class Almost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++)
        {
            String t = sc.nextLine()+"ooo";
            String m = sc.nextLine()+"ooo";
            String b = sc.nextLine()+"ooo";
            if (t.charAt(1)=='X'&&t.charAt(2)=='X'||m.charAt(0)=='X'&&b.charAt(0)=='X'||m.charAt(1)=='X'&&b.charAt(2)=='X')
                System.out.println(1 + " " + 1);
            else if (t.charAt(1)=='X'&&t.charAt(0)=='X'||m.charAt(2)=='X'&&b.charAt(2)=='X'||m.charAt(1)=='X'&&b.charAt(0)=='X')
                System.out.println(1 + " " + 3);
            else if (b.charAt(1)=='X'&&b.charAt(2)=='X'||m.charAt(0)=='X'&&t.charAt(0)=='X'||m.charAt(1)=='X'&&t.charAt(2)=='X')
                System.out.println(3 + " " + 1);
            else if (b.charAt(1)=='X'&&b.charAt(0)=='X'||m.charAt(2)=='X'&&t.charAt(2)=='X'||m.charAt(1)=='X'&&t.charAt(0)=='X')
                System.out.println(3 + " " + 3);
            else if (t.charAt(0)=='X'&&b.charAt(2)=='X'||t.charAt(2)=='X'&&b.charAt(0)=='X'||m.charAt(0)=='X'&&m.charAt(2)=='X'||t.charAt(1)=='X'&&b.charAt(1)=='X')
                System.out.println(2 + " " + 2);
            else if (t.charAt(0)=='X'&&b.charAt(0)=='X'||m.charAt(1)=='X'&&m.charAt(2)=='X')
                System.out.println(2 + " " + 1);
            else if (t.charAt(2)=='X'&&b.charAt(2)=='X'||m.charAt(1)=='X'&&m.charAt(0)=='X')
                System.out.println(2 + " " + 3);
            else if (t.charAt(0)=='X'&&t.charAt(2)=='X'||m.charAt(1)=='X'&&b.charAt(1)=='X')
                System.out.println(1 + " " + 2);
            else if (b.charAt(0)=='X'&&b.charAt(2)=='X'||m.charAt(1)=='X'&&t.charAt(1)=='X')
                System.out.println(3 + " " + 2);
        }
    }
}

/*
3
XOO
 X
 O
OXO
 X
  O

OXO
  X
 */












