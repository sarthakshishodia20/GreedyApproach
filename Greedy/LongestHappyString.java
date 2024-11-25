class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int streakA = 0, streakB = 0, streakC = 0;
        while (a > 0 || b > 0 || c > 0) {
            if ((a >= b && a >= c && streakA < 2) || (streakB == 2 && a > 0) || (streakC == 2 && a > 0)) {
                sb.append('a');
                a--;
                streakA++;
                streakB = streakC = 0;
            } else if ((b >= a && b >= c && streakB < 2) || (streakA == 2 && b > 0) || (streakC == 2 && b > 0)) {
                sb.append('b');
                b--;
                streakB++;
                streakA = streakC = 0;
            } else if ((c >= a && c >= b && streakC < 2) || (streakA == 2 && c > 0) || (streakB == 2 && c > 0)) {
                sb.append('c');
                c--;
                streakC++;
                streakA = streakB = 0;
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
