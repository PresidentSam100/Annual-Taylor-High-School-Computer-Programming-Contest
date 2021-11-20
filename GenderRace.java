import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GenderRace {
    static class Pair
    {
        String f;
        int s;
        String d;
        public Pair(String first, int second, String gen)
        {
            f =first;
            s=second;
            d= gen;
        }
        public int compareTo(Pair p)
        {
           int a = this.s;
           int b = p.s;
           if(a==b) return 0;
           if(a<b) return -1;

           return 1;
        }
        public String toString()
        {
            return f+" "+s+" "+d;
        }

    }

    public static class comp implements Comparator<Pair>
    {

        @Override
        public int compare(Pair pair, Pair t1) {
            return pair.compareTo(t1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Pair> x = new ArrayList<Pair>();
        ArrayList<Pair> y = new ArrayList<Pair>();
        ArrayList<Pair> z = new ArrayList<Pair>();
        for (int i = 0; i < N; i++)
        {
            String a = sc.next();
            int b = sc.nextInt();
            String c = sc.next();
            if(c.equals("F"))
                x.add(new Pair(a, b, c));
            else
                y.add(new Pair(a, b, c));
            z.add(new Pair(a, b, c));
        }
        Collections.sort(x, new comp());
        Collections.sort(y, new comp());
        Collections.sort(z, new comp());
        System.out.println(z.get(0));
        System.out.println(z.get(1));
        System.out.println(y.get(0));
        System.out.println(y.get(1));
        System.out.println(x.get(0));
        System.out.println(x.get(1));
    }
}
