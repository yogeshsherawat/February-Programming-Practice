package InterviewBit.String;

public class task2 {
    public static int helper(int n) {
        if(n<10)
            return n;
        int tmp = 0;
        while (n > 0) {
            tmp += (n % 10);
            n = n / 10;
        }
        return helper(tmp);
    }
    public static void main(String args[]) {
        String s = "1,2,3,4,5:::4,6,9:::8,9,6,5:::9,87,54";
        
        int ans = 0;
        String[] arr = s.split(":::");
        for (int i = 0; i < arr.length; i++) {
            String[] a = arr[i].split(",");
            int count = 0;
            for (int i2 = 0; i2 < a.length; i2++) {
                int k = Integer.parseInt(a[i2]);
                count += k;
            }
            if (helper(count) % 2 == 1)
                ans++;

        }
        System.out.println(ans);

    }
    
}
