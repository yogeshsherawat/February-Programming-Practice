package InterviewBit.String;

public class task3_2 {
    public static void main(String args[]) {
        String s = "6,7,-8,-9";
        String[] arr = s.split(",");
        String ans = "";
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == '-') {
                neg++;
                ans += arr[i].charAt(1);
            }
            else
                ans += arr[i].charAt(0);
        }
        if (neg % 2 == 1)
            System.out.println("-" + ans);
        else
            System.out.println(ans);
    }   
}
