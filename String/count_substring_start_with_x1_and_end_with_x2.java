package InterviewBit.String;

import java.util.*;

public class count_substring_start_with_x1_and_end_with_x2 {

    public static void main(String args[]) {
        String s = "abcd";
        char x1 = 'b';
        char x2 = 'd';
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x2)
                l.add(i);
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x1) {
                count += l.size();
            } else if (s.charAt(i) == x2) {
                l.remove(0);
            }
        }
        System.out.println(count);

    }
    
}
