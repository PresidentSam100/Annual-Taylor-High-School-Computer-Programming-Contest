import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class daytoday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int m = sc.nextInt();
            int d = sc.nextInt();
            int y = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();
            int y2 = sc.nextInt();
            LocalDate a = LocalDate.of(y, m, d);
            LocalDate b = LocalDate.of(y2, m2, d2);
            long days = ChronoUnit.DAYS.between(a, b);
            System.out.println(days-1);
//            Year y = new Year

        }
    }
}
/*
3
6 2 2012 6 22 2012
7 4 2011 12 25 2011
12 28 1980 1 1 1981
 */