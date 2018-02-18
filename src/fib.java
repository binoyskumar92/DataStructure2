public class fib {
    public static void main(String[] args) {
        int n=10;

        int fib[]=new int[n];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++){
           fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i:fib){
            System.out.println(i);
        }
        System.out.println("nth fibonacci number:");
        System.out.println(fib(n-1));
    }
    public static int fib(int n){
        if(n==1)
            return 1;
        else if(n==0)
            return 0;
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
