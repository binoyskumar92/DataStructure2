import java.util.Queue;
import java.util.Scanner;

public class RemoveNthNodeFromEnd {

    Node head;
    private class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
        }
    }
    public void insertAtFront(int d){
        Node n=new Node(d);
        if(head==null){
            head=n;
        }else{
            n.next=head;
            head=n;
        }
    }
    public void insertAtBack(int d){
        Node n=new Node(d);
        if(head==null){
            head=n;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=n;
        }
    }
    public void displayElements(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        int[] arr={0,2,2,1,0,2,1,1,1,2,0};
        RemoveNthNodeFromEnd obj=new RemoveNthNodeFromEnd();
        Scanner sin=new Scanner(System.in);
        for(int e:arr){
            obj.insertAtBack(e);
        }
        System.out.println("Enter n so that it will be deleted from end:");
        int n=sin.nextInt();
        int length=obj.findLengthofLL();
        System.out.println("before delete");
        obj.displayElements();
        obj.deleteNthNodeFromEnd(length-n);
        System.out.println("After delete");
        obj.displayElements();
    }

    private void deleteNthNodeFromEnd(int length) {
        Node current=head;
        Node prev=current;
        int counter=1;
        while(counter<length){
            prev=current;
            current=current.next;
            counter++;
        }
        prev.next=current.next;

    }

    private int findLengthofLL() {
        int length=0;
        Node current =head;
        while(current!=null){
            length++;
            current=current.next;
        }
        return length;
    }


}
