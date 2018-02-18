import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class QueueByStack {
    Stack<Integer> stack;
    Stack<Integer> temp;
    public QueueByStack(){
        stack=new Stack<Integer>();
        temp=new Stack<Integer>();
    }
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        QueueByStack obj=new QueueByStack();
        int ch=1,e=0;
        do{
            System.out.println("1. Enter element to queue");
            System.out.println("2. Delete an element from queue");
            System.out.println("3. Find peek element in queue");
            System.out.println("4. Enter 0 to exit");
            ch=sin.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter element to be inserted");
                    e=sin.nextInt();
                    obj.addElement(e);
                    obj.currentQueueStatus();
                    break;
                case 2:
                    System.out.println("Element deleted: "+obj.deleteElement());
                    obj.currentQueueStatus();
                    break;
                case 3:
                    System.out.println("Peek element: "+obj.peekElement(ch));
                    obj.currentQueueStatus();
                    break;
                case 0:break;
                default:
                    System.out.println("Invalid choice boy");
            }
        }while(ch!=0);
      
    }

    private void currentQueueStatus() {
        Iterator<Integer> iter= stack.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next()+"->");
        }
        System.out.println("");
    }

    private void addElement(int ch) {
        stack.add(ch);
    }
    private int deleteElement() {
        if(!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                temp.push(stack.pop());
            }
            int x = temp.pop();

            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
            return x;
        }
        return -1;
    }
    private int peekElement(int ch) {
        if(!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                temp.push(stack.pop());
            }
            int x = temp.peek();

            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
            return x;
        }
        return -1;
    }
}
