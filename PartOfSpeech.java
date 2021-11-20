import java.util.Scanner;
import java.util.TreeSet;

public class PartOfSpeech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] a = sc.nextLine().trim().split(" ");
        String [] b = sc.nextLine().trim().split(" ");
        String [] c = sc.nextLine().trim().split(" ");
        TreeSet<String> nouns  = new TreeSet<String>();
        TreeSet<String> verbs  = new TreeSet<String>();
        for(int i=0; i<a.length; i++)
            nouns.add(a[i].toLowerCase());
        for(int i=0; i<a.length; i++)
            verbs.add(a[i]);
        for(int i=0; i<a.length; i++)
            verbs.add(a[i]);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            String s = sc.next();
            int n = sc.nextInt();
            sc.nextLine();
            for(int j=0; j<n; j++)
            {
                String y = sc.nextLine();
                String [] x = y.trim().split(" ");
                for(int k=1; k<x.length; k++) {
                    if (x[k].toLowerCase().substring(0, Math.min(s.length(), x[k].length())).equals(s)) {
                        if (nouns.contains(x[k - 1].toLowerCase()))
                            System.out.println("NOUN");
                        else
                            System.out.println("VERB");
//                        System.out.println((x[k-1].toLowerCase()));
                    }
                }
//                System.out.println((y));
            }
            System.out.println();
        }
    }

}
/*
    a an the this
have has had do did does would could should can may
will shall am are is was were be been being
2
die 4
He will die if he does not get a transplant.
The car can die if you get water in the fuel tank.
We will roll a die to move the car in Monopoly.
A die was placed
face 2
I can face my fears.
Please don't hit me in the face!

 */