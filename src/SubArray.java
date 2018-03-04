/*Max sum of contiguous subarray - Kadens algorithm*/
public class SubArray {
    public static void main(String[] args) {
        //int[] arr={2,5,-3,10,1,-3,-9,12};
        int[] arr={23,23,-98,5};
        //int arr[]={-2,-2,3,1,4,5,-6,12}
        int current_max=arr[0],globax_max=arr[0];
        for(int i=1;i<arr.length;i++){
            current_max=Math.max(arr[i],arr[i]+current_max);
            if(current_max>globax_max){
                globax_max=current_max;
            }
        }
        System.out.println("Contiguous subarray sum max: "+globax_max);
    }
}
