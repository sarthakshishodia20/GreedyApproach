class Solution {
    // Array ko sort kro baari baari check kro ki hmara next element apne previous se kitna chota hai uss differrence ko nikalkr usi current mein add krdo and count mein increment kro usi value se .
    public int minIncrementForUnique(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int prev=nums[i];
            int current=nums[i+1];
            if(current<=prev){
                int increment=prev-current+1;
                // +1 isliye likha kyuki unique bnane ke liye 1 number ka bhi diffenece kaafi hai 
                nums[i+1]=current+increment;
                count+=increment;
            }
        }
        return count;
    }
}
