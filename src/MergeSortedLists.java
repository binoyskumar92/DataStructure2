import java.util.LinkedList;
import java.util.PriorityQueue;

public class MergeSortedLists {

    class ListNode implements  Comparable<ListNode>{
       int val;
       ListNode next;
       public ListNode(int val){
           this.val=val;
       }
       public String toString(){
           return this.val+"";
       }@Override
      public int compareTo(ListNode obj){
          return this.val-obj.val;
      }
    }
    PriorityQueue<ListNode> pqueue;
    public static void main(String[] args) {
        MergeSortedLists obj=new MergeSortedLists();
        ListNode[] listNodes=obj.getLists();
        for(ListNode ln:listNodes){
            obj.printNodes(ln);
            System.out.println();
        }
        ListNode head=obj.mergeLists(listNodes);
        obj.printNodes(head);
    }

    private ListNode mergeLists(ListNode[] listNodes) {
    pqueue=new PriorityQueue<>();
    ListNode head=new ListNode(0);
    ListNode p=head;
    for(ListNode ln:listNodes){
        pqueue.offer(ln);
    }
    while(!pqueue.isEmpty()){
        ListNode n=pqueue.poll();
        p.next=n;
        p=p.next;
        if(n.next!=null){
            pqueue.offer(n.next);
        }
    }
    return head.next;
    }

    private void printNodes(ListNode ln) {
        ListNode curr=ln;
        while(curr!=null){
            System.out.print(curr+"->");
            curr=curr.next;

        }
    }

    private ListNode[] getLists() {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(3);
        list1.next.next=new ListNode(5);
        list1.next.next.next=new ListNode(7);

        ListNode list2=new ListNode(2);
        list2.next=new ListNode(4);
        list2.next.next=new ListNode(6);
        list2.next.next.next=new ListNode(8);

        ListNode list3=new ListNode(12);
        list3.next=new ListNode(13);
        list3.next.next=new ListNode(20);
        list3.next.next.next=new ListNode(21);

        return new ListNode[]{list1,list2,list3};
    }
}
