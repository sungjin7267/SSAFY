package section8.section8_5;
import java.util.*;
class Node{
    int value;
    Node lt,rt;
    Node(int value){
        this.value=value;
        lt=rt=null;
    }
}
public class Main {
    Node root; //전역 변수 root 노드
    public void DFS(Node root){
        if(root==null) return; //탐색 노드가 없을 때, 리턴
        else{
            System.out.print(root.value+" ");
            DFS(root.lt); //왼쪽 보기
            DFS(root.rt); //오른쪽 보기
        }
    }
    public static void main(String[]args){
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }
}
