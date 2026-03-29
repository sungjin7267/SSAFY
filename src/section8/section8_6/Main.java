package section8.section8_6;
import java.util.*;

public class Main {
    static int arry[];
    static int N;
    public void DFS(int num){
        if(num==N+1){
            boolean flag=false;
            for(int i=1;i<=N;i++){
                if(arry[i]==1){
                    System.out.print(i+" ");
                    flag=true;
                }
            }
            if(flag) System.out.println();
        }else{
            arry[num]=1;
            DFS(num+1);
            arry[num]=0;
            DFS(num+1);
        }
    }
    public static void main(String args[]){
        Main tree=new Main();
        N=3;
        arry=new int[N+1];
        tree.DFS(1);
    }
}
