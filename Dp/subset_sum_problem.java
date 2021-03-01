package February.Dp;

import java.util.*;

public class subset_sum_problem {

    public static void sol1(int arr[],int tar) {
        Arrays.sort(arr);

        int i = 0;
        int j = 1;
        int curr = 0;
        int n = arr.length;
        while (i < n && j < n) {
            if (curr < tar) {
                curr += arr[j];
                j++;
            } else if (curr == tar) {
                System.out.println("true");
                return;
            } else {
                curr -= arr[i];
                i++;
            }
        }
        System.out.println("False");

    }

    public static void sol2(int arr[], int tar) {
        int sum = 0;
        for(int i:arr)
            sum += i;
            if(tar>sum)
            {
                System.out.println("False");
                return;
            }
        int n = arr.length;
        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++)
        dp[i][0]=1;
    for (int i = 1; i <= sum; i++) 
        dp[0][i] =0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                int k = arr[i - 1];
                if (j - k >= 0 && dp[i - 1][j - k] == 1)
                    dp[i][j] = 1;
              //  System.out.print(dp[i][j] + " ");
            }
            //System.out.println();
        }
        if(dp[n][tar]==1)
            System.out.println("True");
            else
                System.out.println("False");
    }

    public static void main(String args[]) {
        
        int arr[] = { 0, 34, 3, 4, 12, 5, 2 };
        sol1(arr, 37);
        sol2(arr, 37);
        
        }
    
}
