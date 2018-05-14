import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TrieDataStructure {
    private class TrieNode{
        HashMap<Character,TrieNode> children;
        boolean isLastcharacter;
        public TrieNode(){
                children=new HashMap<>();
                isLastcharacter=false;

        }
        public void addChildren(char val){
            if(this.children.containsKey(val)){

            }else{
                this.children.put(val,new TrieNode());
            }

        }

    }
    TrieNode root;
    public TrieDataStructure(){
        root=new TrieNode();

    }
    public boolean find(String st){
        TrieNode currNode=root;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<st.length();i++){
            char currentLetter=st.charAt(i);
            if(currNode.children.containsKey(currentLetter)){
                currNode=currNode.children.get(currentLetter);
                sb.append(currentLetter);
            }else{
                return false;
            }
        }
        System.out.println(sb.toString());
        return true;
    }
    public void insert(String st){
        TrieNode currNode=root;

        for(int i=0;i<st.length();i++){
            char currentLetter=st.charAt(i);
            if(currNode.children.containsKey(currentLetter)){
                currNode=currNode.children.get(currentLetter);
            }else{
                currNode.addChildren(currentLetter);
                currNode=currNode.children.get(currentLetter);
            }
        }
        currNode.isLastcharacter=true;
    }

    public static void main(String[] args) {
        TrieDataStructure obj=new TrieDataStructure();
        obj.insert("Ravi");
        obj.insert("Sankara");
        obj.insert("Setnkara");
        obj.insert("Sitnkara");
        obj.insert("Sankarasaasss");
        obj.insert("Ravis");
        obj.find("Sitnkara");
    }
}
