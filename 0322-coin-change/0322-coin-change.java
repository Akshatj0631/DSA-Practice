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
/* this cant be done because
Consider: coins = [2] amount = 3
int res = 1 + coincount(coins, amount - coin);
We choose coin 2, leaving amount 1.
Since we cannot make amount 1, the recursive function returns 
Integer.MAX_VALUE.
Now Java calculates: int res = 1 + Integer.MAX_VALUE;
Problem: Integer overflow occurs!
Java’s int range ends at 2147483647. Adding 1 wraps around to -2147483648.
Your algorithm might incorrectly treat this negative number as the minimum number of coins.*/
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