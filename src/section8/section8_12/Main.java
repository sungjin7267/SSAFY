package section8.section8_12;
import java.util.*;

public class Main {
    static int num,edge,answer=0;
    static int[]check;
    static ArrayList<Integer>[]arry;
/*    static ArrayList<ArrayList<Integer>>graph;*/
    public void DFS(int node){
        if(node==num) answer++;
        else{
            for(int x:arry[node]){
                if(check[x]==0){
                    check[x]=1;
                    DFS(x);
                    check[x]=0;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        edge=sc.nextInt();
        /*graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=num;i++){
            graph.add(new ArrayList<Integer>());
        }*/
        arry= new ArrayList[num+1];
        for(int i=1;i<=num;i++){
            arry[i]=new ArrayList<>();
        }
        for(int i=0;i<edge;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            arry[n].add(m);
        }
        check=new int[num+1];
        check[1]=1;
        Main T=new Main();
        T.DFS(1);
        System.out.println(answer);
    }
}
