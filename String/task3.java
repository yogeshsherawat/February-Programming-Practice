package InterviewBit.String;

public class task3 {

    public static void main(String args[]) {
        String s = "6,7,-8,-9";
        String[] arr = s.split(",");
        String ans = "";
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            int k = Integer.parseInt(arr[i]);
            if (k < 0) {
                neg++;
                k = -k;
            }
            ans += k;
        }
        if (neg % 2 == 1) 
            System.out.println("-" + ans);
        else
        System.out.println(ans);
    }
    
}
