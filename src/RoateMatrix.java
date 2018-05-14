public class RoateMatrix {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        RoateMatrix obj=new RoateMatrix();
        obj.printArr(arr);

        obj.printArr(obj.transforArr(arr));

    }

    public void printArr(int[][] arr) {
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] transforArr(int[][] arr){
        int res[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=arr[0].length-1;j>=0;j--){
               res[i][arr.length-1-j]=arr[j][i];
            }
        }
        return res;
    }
}
