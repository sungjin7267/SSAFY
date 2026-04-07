package section9.section9_3;
import java.util.*;

class Quest{
    int score,time;

    Quest(int score,int time){
        this.score=score;
        this.time=time;
    }
}
public class Main {
    static int N,M,sum,max=0;
    static Quest[]arry;
    public void DFS(int index,int Tsum,int Ssum){
        if(Tsum>M) return;
        if(index==N){
            max=Math.max(max,Ssum);
        }
        else{
            DFS(index+1,Tsum,Ssum);
            DFS(index+1,Tsum+arry[index].time,Ssum+arry[index].score);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arry=new Quest[N];
        for(int i=0;i<N;i++){
            int s=sc.nextInt();
            int t=sc.nextInt();
            Quest q=new Quest(s,t);
            arry[i]=q;
        }
        Main T=new Main();
        T.DFS(0,0,0);
        System.out.println(max);
    }
}
