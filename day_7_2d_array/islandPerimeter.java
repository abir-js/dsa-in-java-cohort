class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        int p = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0)
                        p++; // for top most row and second top most row
                    if (i == row-1 || grid[i + 1][j] == 0)
                        p++; // for bottom most row and second bottom most row
                    if (j == 0 || grid[i][j - 1] == 0)
                        p++; // for left most row and second left most row
                    if (j == column-1 || grid[i][j + 1] == 0)
                        p++; // for right most row and second right most row
                }
            }
        }
        return p;
    }
}