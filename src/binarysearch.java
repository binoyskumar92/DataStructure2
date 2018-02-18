public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,6,10,24,31};
        binarysearch obj=new binarysearch();
        obj.findNum(arr,24);
    }

    private void findNum(int[] arr, int e) {
        System.out.println(findNum(arr,e,0,arr.length-1));
    }

    private int findNum(int[] arr, int e, int l, int r) {
        if(l<=r) {
            int m = (l +r) / 2;
            if (arr[m] == e)
                return m;
            if (arr[m] > e)
                return findNum(arr, e, l, m - 1);

                return findNum(arr, e, m + 1, r);
        }
        return -1;
    }
}
