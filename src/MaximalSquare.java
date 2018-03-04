public class MaximalSquare {
    public static void main(String[] args) {
        int square[][]={{1,1,0,1,1},{0,1,1,1,1},{0,0,1,1,1},{1,1,1,1,1},{0,1,1,1,0}};
        MaximalSquare obj=new MaximalSquare();
        obj.printMatrix(square,5);
        System.out.println("Length of maximal square:"+obj.maximalSquare(square));
    }
    public void printMatrix(int[][] matrix,int len){
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int maximalSquare(int[][] square) {
        int len = square.length;

        int[][] dp = new int[len][len];
        int max=0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
               if(i==0 || j==0 || square[i][j]==0){ //if first row or first column or elemnt is zero in orginal marix use the same value as orginal
                   dp[i][j]=square[i][j];
               }
               else{
                   dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1; //find minimum of immediate left, top, and top left and add 1
                   max=Math.max(max,dp[i][j]);
               }
            }
        }
        System.out.println("\nDp matrix\n");
        printMatrix(dp,5);
        return max;
    }
}
