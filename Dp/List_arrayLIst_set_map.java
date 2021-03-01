package February.Dp;

import java.util.*;

class A {
    int a;
    int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

}

class sortA implements Comparator<A> {
    
    public int compare(A x,A y){
        return x.a + x.b - (y.a + y.b);
    }
}



public class List_arrayLIst_set_map {

    public static void main(String args[]) {

        // List
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        System.out.println(l);
        ArrayList<Integer> nl = new ArrayList<>(l);
        System.out.println(nl);

        //set
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(10);
        System.out.println(s);
        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        ArrayList<Integer> setList = new ArrayList<>(s);
        System.out.println(setList);

        // map
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(4, 5);
        ArrayList<Integer> map_keys_list = new ArrayList<>(map.keySet());
        ArrayList<Integer> map_values_list = new ArrayList<>(map.values());
        
        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
        Collections.sort(map_keys_list,Collections.reverseOrder());
        System.out.println(map_keys_list);
        // comparator
        ArrayList<A> list_of_A = new ArrayList<>();
        list_of_A.add(new A(1, 2));
        list_of_A.add(new A(10, 20));
        list_of_A.add(new A(2, 4));
        Collections.sort(list_of_A, new sortA());
        for (int j = 0; j < list_of_A.size(); j++) {
            System.out.println(list_of_A.get(j).a + " " + list_of_A.get(j).b);
        }


    }
    
}
