class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);//fill it with amount+1 because it is the max value 
        dp[0]=0;
        for(int i=1;i<=amount;i++)
        {
            for(int coin:coins)
            {
                if(coin<=i)
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
        if(dp[amount]==amount+1) return -1;
        return dp[amount];
    }
}