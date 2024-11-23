class Solution {
    public int minMoves2(int[] nums) {
        // To Make all equal hmne ek middle value isliye choose kri 
        //kyuki small se big or big se small jane mein jyada moves jate 
        //isliye ek middlwe value choose krke chote ko uske or bde ko uske
        // equal rkha jisse moves km lge 

        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int moves=0;
        for(int num:nums){
            moves+=Math.abs(num-median);
        }
        return moves;
    }
}
