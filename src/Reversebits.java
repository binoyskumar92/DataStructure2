public class Reversebits {
    public static void main(String[] args) {
        int n=00000000000000000000000000000001;
        String num=new StringBuffer(n+"").reverse().toString();
        int sum=0,i=num.length()-1;
        for(char c:num.toCharArray()){
            if(c!='-')
                sum+=Math.pow(2,i--)*Integer.parseInt(c+"");
        }
        System.out.println(sum);
    }
}
