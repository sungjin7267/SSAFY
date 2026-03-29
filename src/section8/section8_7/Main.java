package section8.section8_7;
import java.util.*;

class Node{
    int data;
    Node lt,rt;

    Node(int data){
        this.data=data;
        lt=rt=null;
    }
}
public class Main{
    public void BFS(Node node){
        Queue<Node>q=new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.lt!=null){
                q.offer(curr.lt);
            }
            if(curr.rt!=null){
                q.offer(curr.rt);
            }
        }
    }
    Node root;
    public static void main(String args[]){
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.BFS(tree.root);
    }
}
