import java.util.Arrays;
import java.util.PriorityQueue;

public class mergeArray {
    PriorityQueue<ArrayContainer> pqueue;
    class ArrayContainer implements Comparable<ArrayContainer> {
    int arr[];
    int index;

    public ArrayContainer(int[] arr,int index){
        this.arr=arr;
        this.index=index; //shows the head of the array under consideration
    }
    @Override
    public int compareTo(ArrayContainer o){
        return this.arr[this.index] - o.arr[o.index];
    }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7,12 };
        int[] arr2 = { 2, 4, 6, 8 };
        int[] arr3 = { 0, 9, 10, 11 };
        int[] arr4 = { 3, 11, 20, 45,56,76,89 };
        mergeArray obj=new mergeArray();
        int[] result = obj.mergeKSortedArray(new int[][] { arr1, arr2, arr3,arr4 });
        System.out.println(Arrays.toString(result));
    }

    private int[] mergeKSortedArray(int[][] ints) {
        pqueue=new PriorityQueue<>();
        int totalLength=0,index=0;
        for(int[] i:ints){
            pqueue.offer(new ArrayContainer(i,0));
            totalLength+=i.length;
        }
        int result[]=new int[totalLength];
        while(!pqueue.isEmpty()){
            ArrayContainer obj=pqueue.poll();
            result[index++]=obj.arr[obj.index];
            //Once you remove the head element we need to put back the arr with index incremented to point to head of th earray
            if(obj.index<obj.arr.length-1){
                pqueue.offer(new ArrayContainer(obj.arr,obj.index+1));
            }
        }
    return result;
    }
}
