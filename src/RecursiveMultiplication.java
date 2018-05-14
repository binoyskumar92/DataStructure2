public class RecursiveMultiplication {
    public static void main(String[] args) {
        int n1=2,n2=10;
        RecursiveMultiplication obj=new RecursiveMultiplication();
        System.out.println(obj.mulHelper(n1,n2,0));

    }

    private int mulHelper(int n1, int n2,int sum) {
       if(n2>0) {


           sum+= n1 + mulHelper(n1, n2 - 1, sum);
       }
       return sum;
    }
}
