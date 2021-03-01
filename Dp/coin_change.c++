#include <bits/stdc++.h>
using namespace std;
int coin_change(vector<int> arr,int N){
	
	int dp[N+1]={0};
	dp[0]=1;
	
		for(int i=0;i<arr.size();i++){
			for(int j=1;j<=N;j++){
				if(j-arr[i]>=0){
					dp[j]+= dp[j-arr[i]];
				}
			}
		}
		
		
	
	return dp[N];
	

} 
int main(){
	vector<int> coin = {6,2,3,5};
	cout<<coin_change(coin,10);
	
}
