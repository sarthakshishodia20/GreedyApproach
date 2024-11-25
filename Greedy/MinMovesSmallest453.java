class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int moves = 0;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int num : nums) {
            moves += Math.abs(num - min);
        }
        return moves;
    }
}
