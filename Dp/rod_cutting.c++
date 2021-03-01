#include <bits/stdc++.h>
using namespace std;
int rod_cutting(vector<int> len,vector<int> val,int size){
	
	int dp[size+1]={0};
	
		for(int j = 0;j<val.size();j++){
			for(int i=1;i<=size;i++){
			if(i-len[j]>=0)
			dp[i]=std::max(dp[i],dp[i-len[j]]+val[j] );
		}
		
	}
	return dp[size];
	

}
int main(){
	vector<int> len = {1,2,3,4,5,6,7,8};
	vector<int> val = {1,5,8,9,10,17,17,20};
	cout<<rod_cutting(len,val,8)<<endl;
	
}
// unbounded knapsack and rodcutting are similar problems