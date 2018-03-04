import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {9,10,6,7};
        Practice obj = new Practice();
        System.out.println(obj.findMininSorted(arr));
        obj.maxSubArraySum();
        System.out.println(Arrays.toString(obj.plusOne(new int[]{0},0,0)));


    }
    public int[] plusOne(int[] digits,int i,int carry) {
            if(i==0) {
                digits[i] += carry;

                return digits;
            }

            if(digits[i]+1>9){
                digits[i]=0;
                plusOne(digits,i-1,1);
            }else{
                digits[i]=digits[i]+1;

            }

        return digits;
    }

    private void maxSubArraySum() {
        int arr[]={23,23,-98,5};
        int currmax=arr[0],globalmax=arr[0];
        for(int i=1;i<arr.length;i++){
            currmax=Math.max(arr[i],arr[i]+currmax);
            if(currmax>globalmax){
                globalmax=currmax;
            }
        }
        System.out.println(globalmax);
    }

    private int findMininSorted(int[] arr) {
        int l = 0, r = arr.length - 1, mid = 0;
        if (r == 0) {
            return arr[0];
        }
        if (arr[l] < arr[r]) {
            return arr[l];
        }
        while (l <= r) {
            mid = (l + r) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            else if (arr[l] <= arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return -1;
    }
}
