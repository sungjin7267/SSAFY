package section8.section8_11;
import java.util.*;

public class Main {
    static int num,edge,answer=0;
    static int arry[][];
    static int check[];
    public void DFS(int node){
        if(node==num) answer++;
        else{
            for(int i=1;i<=num;i++){
                if(arry[node][i]==1&&check[i]==0){
                    check[i]=1;
                    DFS(i);
                    check[i]=0;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        edge=sc.nextInt();
        arry=new int[num+1][num+1];
        for(int i=0;i<edge;i++){ //
            int n=sc.nextInt();
            int m=sc.nextInt();
            arry[n][m]=1;
        }
        check=new int[num+1];
        check[1]=1;
        Main T=new Main();
        T.DFS(1);
        System.out.println(answer);
    }
}
