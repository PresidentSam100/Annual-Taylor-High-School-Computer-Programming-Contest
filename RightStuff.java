import java.util.Scanner;

public class RightStuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < N; j++)
        {
            double e = sc.nextDouble();
            String[] s = sc.nextLine().trim().split(" ");
            double D[] = new double[s.length];
            double avg = 0;
            double mx =0, mn = Double.MAX_VALUE;
            for(int i=0; i<s.length; i++){

                D[i] = Double.parseDouble(s[i]);
//                System.out.println(D[i]);
                avg+=D[i];
                mx = Math.max(mx, D[i]);
                mn = Math.min(mn, D[i]);
            }
            avg/=s.length;
            boolean a =false, b=false;
            if(Math.abs(avg-e)/e<.05)
            {
                a=true;
            }
            if(mx-avg<.1 && avg-mn<.1)
            {
                b=true;
            }
            if(a&&b)
                System.out.println("Both");
            else if(a)
                System.out.println("Accurate");
            else if(b)
                System.out.println("Precise");
            else
                System.out.println("Neither");
        }
    }
}
