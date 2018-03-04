import java.util.Stack;

/*
* Next greater element in an array is the element to right that is greater than element at i. Intuition is to use a stack
* Keep all the elemnts in stack sorted if some element under scan doesnt fit as sorted pop it as we found next greater element for it
* */
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={98,23,54,12,20,7,27};
        NextGreaterElement obj=new NextGreaterElement();
        obj.findNextGreaterElement(arr,arr.length);
    }

    private void findNextGreaterElement(int[] arr, int length) {
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[0]);
        int i=1;
        while(i<length){

            if(arr[i]<stack.peek()){
                stack.push(arr[i++]);
            }else{
                int ele=stack.pop();
                System.out.println("Greater element for "+ele+"="+arr[i]);
            }

        }
        while(!stack.isEmpty()){
            System.out.println("Greater element for "+stack.pop()+"=null");
        }
    }
}
