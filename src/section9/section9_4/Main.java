package section9.section9_4;
import java.util.*;

public class Main {
    static int num,total,check[],arry[];
    static Queue<Integer>q;
    public int BFS(){
        int level=0;
        q=new LinkedList<>();
        q.offer(0);
        check[0]=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int n=q.poll();
                if(n==total){
                    return level;
                }
                for(int j=0;j<num;j++){
                    if(check[n+arry[j]]==0){
                        q.offer(n+arry[j]);
                        check[n+arry[j]]=1;
                    }
                }
            }
            level++;
        }
        return level;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        arry=new int[num];
        for(int i=0;i<num;i++){
            arry[i]=sc.nextInt();
        }
        total=sc.nextInt();
        check=new int[501];
        Main T=new Main();
        System.out.println(T.BFS());
    }
}
