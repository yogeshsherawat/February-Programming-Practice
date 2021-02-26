package InterviewBit.String;

import java.util.ArrayList;


public class count_substring_that_contains_x_given_no_of_times {

    public static void main(String args[]) {
        
        String str = "abcddd";
        char x = 'd';
        int times = 2;
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x)
                l.add(i);
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (l.size() < times)
                break;
            
                int k = l.get(times - 1);
                count += str.length() - k;
                if (str.charAt(i) == x) {
                    l.remove(0);
                }
            
        }
        System.out.println(count);



    }
    
}
