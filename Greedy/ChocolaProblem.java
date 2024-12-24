class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Integer[] horCuts = Arrays.stream(horizontalCut).boxed().toArray(Integer[]::new);
        Integer[] verCuts = Arrays.stream(verticalCut).boxed().toArray(Integer[]::new);
        Arrays.sort(horCuts, Collections.reverseOrder());
        Arrays.sort(verCuts, Collections.reverseOrder());

        int h = 0;
        int v = 0;
        int cost = 0;
        int hp = 1; 
        int vp = 1; 
        while (h < horCuts.length && v < verCuts.length) {
            if (verCuts[v] < horCuts[h]) {
                cost += horCuts[h] * vp;
                hp++;
                h++;
            } else { 
                cost += verCuts[v] * hp;
                vp++;
                v++;
            }
        }
        while (h < horCuts.length) {
            cost += horCuts[h] * vp;
            hp++;
            h++;
        }
        while (v < verCuts.length) {
            cost += verCuts[v] * hp;
            vp++;
            v++;
        }

        return cost;
    }
}
