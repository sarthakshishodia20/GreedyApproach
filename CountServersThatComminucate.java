class Solution {
    public int countServers(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] rowsCount = new int[rows];
        int[] colsCount = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    rowsCount[i]++;
                    colsCount[j]++;
                }
            }
        }
        int servers = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && (rowsCount[i] > 1 || colsCount[j] > 1)) {
                    servers++;
                }
            }
        }
        return servers;
    }
}
