import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class testparity {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            double d= sc.nextDouble();
            if (d <= 25)
                d *= 2;
            else if (d <= 50)
                d *= 1.5;
            else if (d <= 75)
                d *= 1.25;
            else if (d <= 100)
                d *= 1;
            else if (d <= 120)
                d *= 0.9;
            System.out.print(Math.round(d) + " ");
        }
    }
}
