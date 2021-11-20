import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < 3; i++)
                arr.add(sc.nextInt());
            int sh= sc.nextInt();
            if (sh == 0)
            {
                System.out.println(arr.get(0)+" " + arr.get(1)+" " + arr.get(2) + " "+sh);
                continue;
            }
            arr.add(0, 1);
            for (int i = 0; i < sh-1;i++)
                arr.add(0,0);
            for (int i = 0; i < 3; i++)
                System.out.print(arr.get(i) + " ");
            int ans = 0;
            for (int i = 3; i < arr.size(); i++)
                if (arr.get(i)==1)
                    ans++;
            System.out.println(ans);
            LinkedList<String> list = new LinkedList<String>();
        }
    }
}
