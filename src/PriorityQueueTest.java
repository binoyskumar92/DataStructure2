import java.util.PriorityQueue;

public class PriorityQueueTest {
    PriorityQueue<String> pqueue;
    public PriorityQueueTest(){
        pqueue=new PriorityQueue<>();
    }
    public static void main(String[] args) {
        PriorityQueueTest obj=new PriorityQueueTest();
        obj.addAndPrintQueue();
    }

    private void addAndPrintQueue() {
        pqueue.add("Cat");
        pqueue.offer("Daddy");
        pqueue.offer("Amba");
        while(!pqueue.isEmpty()){
            System.out.println(pqueue.poll());
        }
    }
}
