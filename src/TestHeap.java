import java.util.Arrays;

public class TestHeap {
    private int heapsize;

    public int getHeapsize() {
        return heapsize;
    }

    public void setHeapsize(int heapsize) {
        this.heapsize = heapsize;
    }

    public static void main(String[] args) {
        TestHeap obj=new TestHeap();
        int arr[]=new int[]{2,4,6,1,3,5,11,12};
        System.out.println(Arrays.toString(arr));
        obj.setHeapsize(arr.length);
        obj.buildheap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void buildheap(int[] arr) {
    for(int i=heapsize-1;i>=0;i--){
        heapify(arr,i);
    }

        for(int i=heapsize-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapsize--;
            heapify(arr,0);
        }
    }


    private void heapify(int[] arr, int i) {
    int l=2*i+1;
    int r=2*i+2;
    int largest=0;
    if(l<heapsize && arr[l]>arr[i])
        largest=l;
    else
        largest=i;

    if(r<heapsize && arr[largest]<arr[r])
        largest=r;
    if(largest!=i){
        int t=arr[largest];
        arr[largest]=arr[i];
        arr[i]=t;
        heapify(arr,largest);
    }
    }
}
