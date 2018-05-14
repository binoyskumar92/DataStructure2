public class fibsum {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fibosum(n));
    }

    private static int fibosum(int n) {
    if(n==0)
        return 0;
    if(n==1)
        return 1;
    return fibosum(n-1)+fibosum(n-2)+1;
    }
}
