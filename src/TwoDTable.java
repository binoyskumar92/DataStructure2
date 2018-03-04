public class TwoDTable {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4,5},{3,1,2,8,9},{2,4,6,6,7},{2,8,6,8,7},{2,7,6,1,7}};

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i+1;j++) {
                int k=i+j-1;
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
        int a=0,b=1,c=1;
        while(b<4-c){
            for (a = 0; a < 4; a++) {
                System.out.print("(" + a + "," + (a + c) + ")");

            }
            System.out.println();
            c++;
        }
    }
}
