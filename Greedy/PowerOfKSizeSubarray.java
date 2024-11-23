class Solution {
    public int[] resultsArray(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = nums.length;
        while (j < n) {
            if ((j - i + 1) < k) {
                j++;
            } else if ((j - i + 1) == k) {
                if (isSorted(nums, i, j)) {
                    list.add(nums[j]);
                } else {
                    list.add(-1);
                }
                i++;
                j++;
            }
        }
        int[] ans = new int[list.size()];
        for (int x = 0; x < list.size(); x++) {
            ans[x] = list.get(x);
        }
        return ans; 
    }

    public static boolean isSorted(int[] arr, int i, int j) {
        for (int h = i; h < j; h++) {
            if (arr[h] + 1 != arr[h + 1]) { 
                return false;
            }
        }
        return true;
    }
}
