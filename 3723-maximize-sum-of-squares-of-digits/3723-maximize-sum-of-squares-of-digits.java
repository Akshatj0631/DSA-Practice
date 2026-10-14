class Solution {
    public String maxSumOfSquares(int num, int sum) {
          char[] ans = new char[num];
        int i = 0;
        if(num*9<sum) return new String("");
        while (sum > 0 && i < num) {
            int digit = Math.min(9, sum);
            ans[i] = (char) (digit + '0');
            sum -= digit;
            i++;
        }
        while (i < num) {
            ans[i] = '0';
            i++;
        }
        return new String(ans);
    }
}