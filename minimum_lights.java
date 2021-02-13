package InterviewBit;
import java.util.*;

class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int ans = 1;
        int count = 0;
        for (int i = 0; i < n;) {
            
            System.out.println("i:" + i);
            int chk = 0;
                int s = (i - b + 1 >= 0 ? i - b + 1 : 0);
                int e = (i + b - 1 < n ? i + b - 1 : n - 1);
                System.out.println(s + " " + e);
                for (int j = e; j >= s; j--) {
                    if (arr[j] == 1) {
                        i = j + b;
                        chk = 1;
                        count++;
                        break;
                    }
                }
                if (chk == 0 && arr[i] == 0) {
                    ans = 0;
                    break;
                }
                else if(chk==1)
                    continue;
                else{
                    i = e + 1;
                }

            
        }
        if (ans == 0)
            System.out.println("-1");
        else
            System.out.println(count);
        

    
        sc.close();
        
    }

}