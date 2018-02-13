public class SortZeroOneTwo {
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
        SortZeroOneTwo obj=new SortZeroOneTwo();
        obj.sort(arr);
        obj.displayElements();

    }

    private void sort(int a[]) {
        Node current=head;
        int twocounter=0;
        for(int i:a){
            if(i==0){
                this.insertAtFront(0);
            }else if(i==1){
                this.insertAtBack(1);
            }else{
                twocounter++;
            }
        }
        for(int j=0;j<twocounter;j++){
            this.insertAtBack(2);
        }
    }
}
