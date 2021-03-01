package February.String;

public class task2 {
    public static long helper(long n) {
        if(n<10)
            return n;
        long tmp = 0;
        while (n > 0) {
            tmp += (n % 10);
            n = n / 10; 
        }
        return helper(tmp);
    }
    public static void main(String args[]) {
        //String s = "0,2,30,0,5;;;4,6,9;;;8,9,6,5;;;9,87,54";
        //String s = "10";
        //String s = ";;;";
        String s = ";;;1,2,3,4,5;;;";
        if(s.length()==0)
        {
            System.out.println("0");
            return;
        }
        long ans = 0;
        String[] arr = s.split(";;;");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()==0)
                continue;
            String[] a = arr[i].split(",");
            long count = 0;
            for (int i2 = 0; i2 < a.length; i2++) {
                long k = Long.parseLong(a[i2]);
                count += k;
            }
            if (helper(count) % 2 == 1)
                ans++;

        }
        System.out.println(ans);

    }
    
}
