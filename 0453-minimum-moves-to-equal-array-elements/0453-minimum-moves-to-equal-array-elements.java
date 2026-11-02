class Solution {
    public int minMoves(int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE;
        for (int x : nums) {
            sum += x;
            min = Math.min(min, x);
        }
        return sum - nums.length * min;
    }
}
//If you can increment all elements except one, think about decrementing one element.