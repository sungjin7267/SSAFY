package section8.section8_10;
import java.util.*;
class Node{
    int data;
    Node lt,rt;
    Node(int data){
        this.data=data;
        lt=rt=null;
    }
}
public class Main {
    Node root;
    public int BFS(Node root){
        Queue<Node>q =new LinkedList<>();
        q.offer(root);
        int L=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.lt==null&&curr.rt==null) return L;
                if(curr.lt!=null) q.offer(curr.lt);
                if(curr.rt!=null) q.offer(curr.rt);
            }
            L++;
        }
        return L;
    }
    public static void main(String[]args){
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.lt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
