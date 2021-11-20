import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SnapshotDay {
//    private static Object comp;

    static class Pair
    {
        double f;
        int s;
        public Pair(double first, int second)
        {
            f =first;
            s=second;
        }
        public int compareTo(Pair p)
        {
            if(f==p.f && s==p.s)
            {
                return 0;
            }
            if(f==p.f)
            {
                if(s<p.s)
                    return -1;
                else
                    return 1;
            }
            if(f<p.f)
            return -1;
                else
            return 1;
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
//        int N = sc.nextInt();
        int T =0;
        int en=0;
        ArrayList<Pair> d = new ArrayList<Pair>();
        for (int i = 0; i < 6; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            en+=a;
            T+=c;
            double x = (double)b/(double)a;
            d.add(new Pair(x, i+1));
        }
        Collections.sort(d, new comp());
//        System.out.println("Godd");
        System.out.println(en);
        System.out.println(T);
        System.out.println(d.get(0).s);
        for(int i=0; i<5; i++)
            System.out.print(d.get(i).s+" ");
        System.out.println(d.get(5).s);
    }

}
