public class SortZeroOne {
    public static void main(String[] args) {
        int a[]={0,1,1,0,0,0,1,0};
        int l=0,r=a.length-1;

        while(l<r){
            while(a[l]==0&&l<r)
                l++;
            while(a[r]==1&&l<r)
                r--;
            if(l<r){
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
