import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7};
        ReverseArray obj=new ReverseArray();
        obj.rotateArray(arr,3);
        System.out.println("After rotation:");
        System.out.println(Arrays.toString(arr));
    }
    /*
    Rotate array by k=3
    (1,2,3,4) -> 4,3,2,1
    (5,6,7) -> 7,6,5
    (4,3,2,1,7,6,5) -> 5,6,7,1,2,3,4
    * */
    private void rotateArray(int[] arr,int k) {
        if(k>arr.length)
            k=k%arr.length;
        arrReverse(arr,0,arr.length-k-1);
        arrReverse(arr,arr.length-k,arr.length-1);
        arrReverse(arr,0,arr.length-1);
    }

    private void arrReverse(int[] arr, int left,int right) {

        while(left<right){
            int t=arr[left];
            arr[left]=arr[right];
            arr[right]=t;
            left++;
            right--;
        }
    }

}
