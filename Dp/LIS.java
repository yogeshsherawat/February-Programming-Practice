package InterviewBit.Dp;

import java.util.*;
public class LIS {
    
    
    public static int lis_dp(int arr[],int n){
        int dp[]=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
        }
        return dp[n-1];
    }
    
    public static void main(String args[]) {
        int arr[] = { 10, 22, 9,10,11,12,13,15,16,17, 2, 234 };
        int k = LIS_fun(arr, 0, 0, arr.length);
        int k2 = lis_dp(arr, arr.length);
        System.out.println(k);
        System.out.println(k2);
    }
}
