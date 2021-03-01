package February.Dp;

import java.util.*;

class smallest_sequence_with_primes {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < d; i++) {
            int k1 = list.get(x) * a;
            int k2 = list.get(y) * b;
            int k3 = list.get(z) * c;
            if (k1 <= k2 && k1 <= k3) {
                list.add(k1);
                x++;
            
            }
            else if(k2<k1 && k2<k3)
            {
                list.add(k2);
                y++;
            }
            else if(k3<k1 && k3<k2){
                list.add(k3);
                z++;
            }
        }
        System.out.println();
        for (int i = 1; i <= d; i++)
            System.out.println(list.get(i));
        sc.close();

    }
}
