import java.util.Scanner;

public class Puddle {
    static String[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        visited = new boolean[R][C];
        arr = new String[R][C];
        for (int i = 0; i < R; i++)
        {
            String s = sc.next();
            for (int j = 0; j < C; j++)
            {
                arr[i][j] = s.substring(j, j+1);
            }
        }
        int a = sc.nextInt();
        for (int i = 0; i < a; i++)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (arr[r][c].equals("G"))
                System.out.println("OK");
            else if (arr[r][c].equals("W"))
            {
                arr[r][c]="F";
                flood(r, c);
                System.out.println("PUDDLE");
            }
            else if (arr[r][c].equals("R") || arr[r][c].equals("S"))
                System.out.println("OOPS");
        }
        System.out.println();
        for (int i = 0; i < R; i++)
        {
            for (int j = 0; j < C; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void flood(int r, int c)
    {
        if (r < 0 || r > arr.length - 1 || c < 0 || c > arr[0].length - 1)
            return;
        if (visited[r][c]||"RSG".contains(arr[r][c]))
            return;
        if ("W".equals(arr[r][c]))
            arr[r][c]="F";
        visited[r][c] = true;
        flood(r, c-1);
        flood(r, c+1);
        flood(r+1, c);
        flood(r-1, c);
    }
}
/*
10 10
GWGGGGRRGG
WWGGGGGSSG
RSGGGGSSSS
SSSWWWGGGG
SSRWWGGGGG
RRRWGGGGGG
GGGGRRRGGG
GGGSSSSSSG
WWWGGWWWWR
GWWWWWGGSS
6
0 0
1 1
2 2
2 5
4 4
9 9
 */