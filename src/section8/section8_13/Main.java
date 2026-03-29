package section8.section8_13;
import java.util.*;

public class Main {
    static int node,edge,level=1;
    static int check[];
    static Queue<Integer>q;
    static ArrayList<Integer>[]arry;
    static int answer[];
    public void BFS(int node){
        q=new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                for(int x:arry[curr]){
                    if(check[x]==0){
                        q.offer(x);
                        answer[x]=level;
                        check[x]=1;
                    }
                }
            }
            level++;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        node=sc.nextInt();
        edge=sc.nextInt();
        arry=new ArrayList[node+1];
        for(int i=1;i<=node;i++){
            arry[i]=new ArrayList<>();
        }
        for(int i=0;i<edge;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            arry[n].add(m);
        }
        answer=new int[node+1];
        check=new int[node+1];
        Main T=new Main();
        check[1]=1;
        T.BFS(1);
        for(int i=2;i<=node;i++){
            System.out.println(i+" : "+answer[i]);
        }
    }
}
