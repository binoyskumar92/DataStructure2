import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int arr[]=new int[]{1,0,1};
        int arr2[]=new int[]{1,2,0,2,4,5,2,0,0,0,1,0};
        moveZeroesinArray(arr);
        System.out.println(Arrays.toString(arr));
        moveZeroSecondMethod(arr2);
    }

    private static void moveZeroSecondMethod(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroesinArray(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0 && nums[i+1]!=0){
                int t=nums[i+1];
                nums[i+1]=nums[i-count];
                nums[i-count]=t;

            }else if(nums[i]==0){
                count++;
            }else{

            }
        }
    }

}
