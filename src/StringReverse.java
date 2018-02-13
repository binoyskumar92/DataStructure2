public class StringReverse {
    public static void main(String[] args) {
        String st= "My name is RIchard";
        StringBuilder sb=new StringBuilder("");
        StringBuilder sbfinal=new StringBuilder("");
        String words[]=st.split(" ");
        for(String word:words){
            sb.setLength(0);
            sb.append(word).reverse();
            sbfinal.append(sb.toString()+" ");
        }
        System.out.println("Reversed string: "+sbfinal.toString().trim());
    }
}
