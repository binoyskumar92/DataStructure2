import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort obj=new QuickSort();
        int arr[]={3,2,6,11,7,20,1};
        obj.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int lb, int ub) {
        if(lb<=ub){
            int pivotIndex=partition(arr,lb,ub);
            quickSort(arr,lb,pivotIndex-1);
            quickSort(arr,pivotIndex+1,ub);
        }else{
            return;
        }
    }

    private int partition(int[] arr, int lb, int ub) {
        int pivot=arr[lb];
        int up=ub;
        int down=lb;
        while(down<up) {
            while (arr[down] <= pivot && down<ub)
                down++;
            while (arr[up] > pivot)
                up--;
            if (down < up) {
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        int temp=arr[up];
        arr[up]=arr[lb];
        arr[lb]=temp;
        return up;
    }

}
