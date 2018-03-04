import java.util.Arrays;

public class HeapSort {
    int heapSize;
    public static void main(String[] args) {
        int arr[]={9,6,5,0,8,2,7,1,3};
        HeapSort obj=new HeapSort();
        obj.buildHeap(arr);
    }

    private void buildHeap(int[] arr) {
        heapSize=arr.length;
        System.out.println(Arrays.toString(arr));
        for(int i=heapSize/2-1;i>=0;i--){
            heapify(arr,i);
        }
        for(int i=heapSize-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapSize--;
            heapify(arr,0);
        }
        System.out.println(Arrays.toString(arr));
    }

    private void heapify(int[] arr, int i) {
        int left=2*i+1;
        int right=2*i+2;
        int largest=i;
        if(left<heapSize && arr[left]>arr[i]){
            largest=left;
        }
        if(right<heapSize && arr[right]>arr[largest])
            largest=right;
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,largest);
        }

    }
}
