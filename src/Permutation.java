public class Permutation {
    public static void main(String[] args) {
    Permutation obj =new Permutation();
    StringBuilder st=new StringBuilder("123");
    StringBuilder chosen=new StringBuilder("");
    obj.permutationofString(st,chosen);
    }
    public void permutationofString(StringBuilder st,StringBuilder chosen){
        //if chosen string is full and actual string becomes empty
        if(st.length()==0){
            System.out.println(chosen.toString());
        }else{
            //Recursive phase-> choose,explore and unchoose
            for(int i=0;i< st.length();i++){
                char c= st.charAt(i);
                st.deleteCharAt(i);
                chosen.append(c);
                permutationofString(st,chosen);
                st.insert(i,c);
                chosen.deleteCharAt(chosen.length()-1);
            }
        }
    }


}
