class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int mod = 1_000_000_007;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        pq1.add(horizontalCuts[0]);
        pq1.add(h - horizontalCuts[horizontalCuts.length - 1]);
        for (int i = 1; i < horizontalCuts.length; i++) {
            pq1.add(horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        pq2.add(verticalCuts[0]); 
        pq2.add(w - verticalCuts[verticalCuts.length - 1]);
        for (int i = 1; i < verticalCuts.length; i++) {
            pq2.add(verticalCuts[i] - verticalCuts[i - 1]);
        }
        int maxDifferenceFromHorizontal = pq1.poll();
        int maxDifferenceFromVertical = pq2.poll();
        return (int) ((long) maxDifferenceFromHorizontal * maxDifferenceFromVertical % mod);
    }
}
