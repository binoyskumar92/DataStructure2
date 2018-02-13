public class Test2 {
    public static void main(String[] args) {
        String s="acxz";
        String revString = new StringBuilder(s).reverse().toString();
        int j=s.length()-1,flag=0;
        for(int i=1;i<s.length();i++)
        {
            if(Math.abs(s.charAt(i)-s.charAt(i-1))!=Math.abs(revString.charAt(i)-revString.charAt(i-1))){
                flag=1;
                break;
            }
        }

        if(flag==1){
            System.out.println("Not Funny") ;
        }else{
            System.out.println("Funny") ;
        }
    }
}
