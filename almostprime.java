import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class almostprime {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        boolean sieve[] = new boolean[1000000];
        for(int i=0; i<1000000; i++)
            sieve[i]=false;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=2; i*i<=1000000; i++)
        {
            if(!sieve[i])
            {
                a.add(i);
            }
            else continue;
            for(int j=i+i; j<1000000; j+=i)
            {
//                System.out.println(i);
                sieve[j]=true;
            }
        }
//        System.out.println(a);
        while(sc.hasNextInt())
        {
            int n = sc.nextInt();
            System.out.println(a.get(n-1)*a.get(n-1));
        }
    }
}
