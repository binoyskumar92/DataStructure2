import java.util.Arrays;

public class ArrayLeaders {
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};
        int size=a.length;
        int currentLeader=a[size-1];
        System.out.println(currentLeader);
        for(int i=size-2;i>=0;i--){
            if(currentLeader<a[i]){
                currentLeader=a[i];
                System.out.println(currentLeader);
            }

        }

    }


}
