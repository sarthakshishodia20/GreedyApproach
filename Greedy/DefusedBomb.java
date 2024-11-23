class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            return result;
        }
        for (int i = 0; i < n; i++) {
            if (k > 0) {
                result[i] = getSumForward(i, k, code);
            } else {
                result[i] = getSumBackward(i, -k, code);
            }
        }
        return result;
    }
    private int getSumForward(int start, int times, int[] code) {
        int sum = 0;
        int n = code.length;
        for (int i = 1; i <= times; i++) {
            sum += code[(start + i) % n];
        }
        return sum;
    }
    private int getSumBackward(int start, int times, int[] code) {
        int sum = 0;
        int n = code.length;
        for (int i = 1; i <= times; i++) {
            sum += code[(start - i + n) % n]; 
        }
        return sum;
    }
}
