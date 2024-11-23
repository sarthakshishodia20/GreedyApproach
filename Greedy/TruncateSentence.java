class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (k == 0) {
                break;
            }
            else{
                sb.append(arr[i]);
                sb.append(" ");
            }
            k--;
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
