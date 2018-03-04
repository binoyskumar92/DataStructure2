import java.util.Arrays;

public class ThreeSUm {
    public static void main(String[] args) {
        ThreeSUm obj=new ThreeSUm();
        int arr[]={12,3,4,1,6,9};
        int target=24;
        obj.threeSum(arr,target);
    }

    private void threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int l=i+1,r=arr.length-1;int sum=target-arr[i];
            while(l<r){
                 if(arr[l]+arr[r]==sum){
                     System.out.println(arr[l]+" "+arr[r]+" "+arr[i]);
                     break;
                 }else if(arr[l]+arr[r]<sum){
                     l++;
                 }else{
                     r--;
                 }
            }
        }
    }
}
