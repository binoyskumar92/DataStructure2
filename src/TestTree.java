import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestTree {
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node root;
    public void insert(int val){
        if(root==null){
            root=new Node(val);
        }else{
            Node current=root;
            Node  parent;
            while(current!=null){
                if(val<current.val){
                    parent=current;
                    current=current.left;
                    if(current==null){
                        parent.left=new Node(val);
                    }
                }else{
                    parent=current;
                    current=current.right;
                    if(current==null){
                        parent.right=new Node(val);
                    }
                }
            }
        }
    }
    public void printTree(Node localRoot){
        if(localRoot!=null){
            System.out.println(localRoot.val);
            printTree(localRoot.left);
            printTree(localRoot.right);
        }

    }
    public void bfs(Node localRoot){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node t=q.poll();
            System.out.print(t.val+" ");
            if(t.left!=null)
                q.offer(t.left);
            if(t.right!=null)
                q.offer(t.right);
        }
    }
    public void dfs(Node localRoot){
        Stack<Node> stack=new Stack<>();
        stack.push(localRoot);
        while(!stack.isEmpty()){
            Node t=stack.pop();
            System.out.print(t.val+" ");
            if(t.right!=null)
                stack.push(t.right);
            if(t.left!=null)
                stack.push(t.left);
        }
    }
    public int heightOfTree(Node localRoot){
        if(localRoot==null){
            return -1;
        }else{
            int left=heightOfTree(localRoot.left);
            int right=heightOfTree(localRoot.right);
            return 1+Math.max(left,right);
        }
    }

    public static void main(String[] args) {
        TestTree obj=new TestTree();
        obj.insert(8);
        obj.insert(12);
        obj.insert(11);
        obj.insert(13);
        obj.insert(14);
        obj.insert(6);
        obj.insert(5);
        obj.insert(7);
        obj.insert(1);
        obj.printTree(obj.getRoot());
        obj.bfs(obj.getRoot());
        System.out.println();
        obj.dfs(obj.getRoot());

        System.out.println("\nHeight of tree: "+obj.heightOfTree(obj.getRoot()));
    }
}
