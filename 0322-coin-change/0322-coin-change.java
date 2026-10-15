class Solution {
    static int dp[];
    int coincount(int coins[],int amount)
    {
        if(amount==0) return dp[amount]=0;
        if(amount<0) return Integer.MAX_VALUE;
        if(dp[amount]!=-1) return dp[amount];
        int min=Integer.MAX_VALUE;
        for(int coin:coins)
        {
            int res=coincount(coins,amount-coin);
            if(res!=Integer.MAX_VALUE)
            min=Math.min(min,res+1);
        }
        dp[amount]=min;
        return dp[amount];
    }
    public int coinChange(int[] coins, int amount) {
        dp=new int[amount+1];
        Arrays.fill(dp,-1);
       int result=coincount(coins,amount);
       return result==Integer.MAX_VALUE?-1:dp[amount];
    }
}