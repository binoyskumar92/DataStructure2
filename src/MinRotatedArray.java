/*

Roated sorted array
1. find minimum eleement
2. find an element

*/

public class MinRotatedArray {
    public static void main(String[] args) {
        MinRotatedArray obj= new MinRotatedArray();
        int arr[]={102,112,3,4,5,12,45,55,98};
        System.out.println(obj.findMin(arr));
        System.out.println(obj.findanElement(arr,55));
    }
    public int findanElement(int[] arr,int num){
        int start=0,len=arr.length,end=len-1,mid=0;
        while(start<=end) {
            mid = (start + end) / 2;
            if (arr[mid] == num) {
                return mid;
            }else if(arr[start]<arr[mid]) { //find the sorted section
                if (arr[start] <= num && num <= arr[mid]) { //now find where exactly the number lies int he sroted section
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }else {
                if (arr[mid] <= num && num <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    private int findMin(int[] arr) {
        int n=arr.length;
        int start=0,end=n-1,mid=0;
        if(n==0){
            return -1;
        }
        else if(arr[0]<arr[n-1]){
            return -1;
        }else if(n==1){
            return 0;
        }else{
            while(start<end){
                mid=(start+end)/2;
                if(arr[mid]>mid+1){ //only at one index value dips and thats pivot and all other places value increases
                    return mid+1;
                }else if(arr[start]<arr[mid]){ //if sorted then check the other section
                    start=mid+1;
                }else if(arr[start]>arr[mid]){
                    end=mid-1;
                }
            }
            return -1;
        }
    }
}
