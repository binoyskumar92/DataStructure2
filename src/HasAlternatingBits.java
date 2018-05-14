public class HasAlternatingBits {
    /*
   n =         1 0 1 0 1 0 1 0
   n >> 1      0 1 0 1 0 1 0 1
   n ^ n>>1    1 1 1 1 1 1 1 1
   n           1 1 1 1 1 1 1 1
   n + 1     1 0 0 0 0 0 0 0 0
   n & (n+1)   0 0 0 0 0 0 0 0
   */
    public static void main(String[] args) {
        int n=14,flag=0;
        String st=Integer.toBinaryString(n);
        System.out.println(st);
        for(int i=0;i<st.length()-1;i=i+2){
            if(st.charAt(i)=='1' && st.charAt(i+1)=='0'){
               flag=0;

            }else{
                flag=1;
                break;
            }
        }
        if(st.length()%2!=0){
            if(st.charAt(st.length()-1)!='1'){
                flag=1;
            }
        }
        if(flag==1)
            System.out.println("Not alternating");
        else
            System.out.println("Alternating");
    }
}
