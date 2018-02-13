public class ArrayGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr={5,6,8,8,5};
        int res=findMinimumMoves(arr);
        System.out.println(res);
    }
    public static int findMinimumMoves(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){  //find index in the array which has max value
            if(arr[i]>arr[max]) max=i;
        }
        boolean flag=true;//to check if all elements are equal after incrementing by 1
        int count=0; // count of minimum number of moves to make all elements equal
        int temp=max;
        while(flag){
            count++;
            flag=false;
            int i;
            for(i=0;i<arr.length;i++){
                if(max!=i){ //increment all values of array by 1 except the max index
                    arr[i]++;
                    if(arr[max]+1==arr[i]) temp=i; //store the index of max value in temp
                    if(i<arr.length-1 && arr[i]!=arr[max]) flag=true;//execute while loop until you find all elements equal in array
                }

            }
            max=temp;//store new value of max after incrementing
            if(arr[i-1]!=arr[i-2]) flag=true;//check for last two elements which was missed in for loop
        }
        return count;
    }

}
