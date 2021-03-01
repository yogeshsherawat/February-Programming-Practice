package February.String;

public class task3_1 {
    public static void main(String args[]) {
        String s = "0,0,-1,-4,8,-9";
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
        String newAns = "";
        int initialZeros = 1;
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '0' && initialZeros == 1) {
                continue;
            }
            if (ans.charAt(i) != '0')
                initialZeros = 0;
            newAns += ans.charAt(i);

        }
        if (newAns.length() == 0) {
            System.out.println("0");
        }
        if (neg % 2 == 1)
            System.out.println("-" + newAns);
        else
            System.out.println(newAns);
    }
    
}
