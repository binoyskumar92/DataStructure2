public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        PeakElement obj = new PeakElement();
        System.out.println(obj.findPeakElement(arr));
    }


    private int findPeakElement(int[] arr) {
        int start = 0, end = arr.length - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if((mid==0 || (arr[mid] >= arr[mid - 1])) && (mid==arr.length-1 || arr[mid] >= arr[mid + 1])){
            return arr[mid];
            }
            else if (mid>0 && arr[mid-1]>=arr[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        return -1;
    }
}
