class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int totalIncrease=0;
        int largestInRow[]=new int[grid.length];
        int largestInColumn[]=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>largestInRow[i]){
                    largestInRow[i]=grid[i][j];
                }
                if(grid[i][j]>largestInColumn[j]){
                    largestInColumn[j]=grid[i][j];
                }
            }
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<largestInRow[i] && grid[i][j]<largestInColumn[j]){
                    totalIncrease+=Math.min(largestInRow[i],largestInColumn[j])-grid[i][j];
                }
            }
        }
        return totalIncrease;
    }
}