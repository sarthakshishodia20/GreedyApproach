class Solution {
    public int minOperations(int[] nums) {
        // Same as Leetcode 945 kch difference nahi hai
        // Array ko sort kia prev or current ko check kia ki kitne ka difference hai utne se current ko increase kia utna hi count mein add kia 
        // Increment mein prev-current hmara difference btata hai ki kitna difference aa rha or +1 hmara uniqueness show krata hai jisse 1 number ka difference bna rhe 
        
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int prev = nums[i];
            int current = nums[i + 1];
            if (current <= prev) {
                int increment = prev - current + 1; 
                nums[i + 1] += increment;          
                count += increment;               
            }
        }
        return count;
    }
}
