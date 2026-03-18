/*
package section6.section6_8;
import java.util.*;

public class Main {
    public class Person{
        int sequence;
        int danger;

        public Person(int sequence,int danger){
            this.sequence=sequence;
            this.danger=danger;
        }
    }
    public int solution(int pnum,int pick,int[]arry){
        Queue<Integer>q=new LinkedList<>();
        for(int x:arry){
            q.offer(x);
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int x:q){
                if(x>curr)
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pnum=sc.nextInt();
        int pick=sc.nextInt();
        int arry[]=new int[pnum];
        for(int i=0;i<pnum;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(pnum,pick,arry));
    }
}
*/
