public class SubArrayWithSum {
    public static void main(String[] args) {
        int arr[]={1,2,5,7,10};
        int refsum=1,sum=arr[0],l=0,r=0;
        while(l<=r){
            if(sum==refsum){
                System.out.println(l+","+r);
                break;
            }
            else if(sum<refsum){
                r++;
                sum+=arr[r];
            }else{
                sum-=arr[l];
                l++;
            }

        }

    }
}
