package InterviewBit.String;

import java.util.*;

public class task_1 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() < 8) {
            System.out.println("Invalid");
            return;
        }
        int cond1 = 0;
        int cond2 = 0;
        int cond3 = 0;
        int cond4 = 0;
        HashSet<Character> upr = new HashSet<>();
        for (char c = 'A'; c <= 'Z'; c++) {
        
        upr.add(c);
    }

        HashSet<Character> lwr = new HashSet<>();
        for(char c='a';c<='z';c++){
            lwr.add(c);
        }
        HashSet<Character> dig = new HashSet<>();
        for(int i=0;i<10;i++){
            String ss = "";
            ss+=i;
            dig.add(ss.charAt(0));
        }
        HashSet<Character> spcl = new HashSet<>();
        // yaha p manually add krlio spcl characters
        spcl.add('~');
        spcl.add('!');
        // aise sare krlio
        // 10 15 sare hai
        // inki assci values chor chor ke hai to aise hi add krdio
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(upr.contains(c))
            cond1=1;
            else if(lwr.contains(c))
            cond2=1;
            else if(dig.contains(c))
            cond3=1;
            else if(spcl.contains(c))
            cond4=1;
        }
        if(cond1==0 || cond2==0 || cond3==0 || cond4==0)
        {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Valid");


    }

    
}
