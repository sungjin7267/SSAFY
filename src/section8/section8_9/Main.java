package section8.section8_9;

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
    int min=Integer.MAX_VALUE;
    public void DFS(Node node,int L){
        if(node==null){
            return;
        }
        if(node.lt==null&&node.rt==null){
            min=Math.min(min,L);
            return;
        }
        DFS(node.lt,L+1);
        DFS(node.rt,L+1);
    }
    public static void main(String[]args){
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.DFS(tree.root,0);
        System.out.println(tree.min);
    }
}
