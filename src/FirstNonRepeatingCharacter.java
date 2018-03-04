/*
*
* Find first non repeating characte rin a string.
* Intuition is that have an index array of size 26 intialised to -1. Whenever you find a new character
* find its index by subtracting 65. now check if index arry for that idex is -1, if so add the index there.
* If again that element is found mark it -2.
* Now once this process is over we just need to iterate over index array to see +ve number and print corresponding
* character.
*
* */
import java.util.Arrays;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String st="ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
        FirstNonRepeatingCharacter obj=new FirstNonRepeatingCharacter();
        obj.findCharacter(st.toUpperCase(),st.length());
    }

    private void findCharacter(String st, int length) {
    int index[]=new int[26];
    for(int i=0;i<26;i++){
        index[i]=-1;
    }
    for(int i=0;i<length;i++){
        int asciiIndex=(int)st.charAt(i)-65;
        if(index[asciiIndex]==-1){
            index[asciiIndex]=asciiIndex;
        }else if(index[asciiIndex]>=0){
            index[asciiIndex]=-2;
        }
    }
        System.out.println(Arrays.toString(index));
        for(int i:index){
            if(i>0)
            {
                int val=i+65;
                System.out.println((char)val);
                break;
            }
        }
    }
}
