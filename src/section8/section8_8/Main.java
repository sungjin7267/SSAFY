package section8.section8_8;
import java.util.*;


public class Main {
    Queue<Integer>q=new LinkedList<>();
    int check[];
    int dis[]={-1,1,5};
    public int BFS(int people,int cow){
        /*Queue<Integer> q=new LinkedList<>();
        int L=0;
        q.offer(people);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                if(list.contains(curr)){
                    continue;
                }
                list.add(curr);
                if(curr==cow) {
                    return L;
                }
                q.offer(curr-1);
                q.offer(curr+1);
                q.offer(curr+5);
            }
            L++;
        }
        return L;*/
        int L=0;
        check=new int[10001];
        check[people]=1; //방문 체크
        q.offer(people);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                for(int j=0;j<3;j++){
                    int child=curr+dis[j];
                    if(child==cow) return L+1;
                    if(child>=0 &&child<=10000&&check[child]==0){ // 지금까지 안나온 숫자만 자식에 추가
                        check[child]=1;
                        q.offer(child);
                    }
                }
            }
            L++;
        }
        return L;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int people=sc.nextInt();
        int cow=sc.nextInt();
        Main tree=new Main();
        System.out.println(tree.BFS(people,cow));
    }
}
