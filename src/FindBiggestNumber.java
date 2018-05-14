import java.util.Arrays;
import java.util.Comparator;

public class FindBiggestNumber {
    public static void main(String[] args) {
        FindBiggestNumber obj=new FindBiggestNumber();
        String arr[]={"54", "546", "548", "60"};
        //System.out.println(obj.findBiggestNumber(new int[]{54, 546, 548, 60}));
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String s1,String s2){
            return (s1+s2).compareTo(s2+s1)>0?-1:1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
    public String findBiggestNumber(int arr[]){
        if(arr==null || arr.length==0)
            return "";

        arr = sortByFirstDigigt(arr);
        StringBuilder st=new StringBuilder("");

        for(int i:arr){
            st.append(i);
        }
        return st.toString();
    }

    /*Customised sort based on first digit*/
    public int[] sortByFirstDigigt(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(getFirstdigit(arr[j])<getFirstdigit(arr[j+1])){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    return arr;
    }

    /* helper method to get first digit */
    public int getFirstdigit(int num){
        int n=num;
        int digit=0;
        while(n!=0){
            digit=n%10;
            n=n/10;
        }
        return digit;
    }

}
