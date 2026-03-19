package section6.section6_8;
import java.util.*;

class Person{
    int sequence, danger;
    Person(int sequence,int danger){
        this.sequence=sequence;
        this.danger=danger;
    }
}
public class Main {
    public int solution(int num,int pick,int arry[]){
        Queue<Person>q=new LinkedList<>();
        int answer=0;
        for(int i=0;i<num;i++){ //q에 정보 넣기
            Person p=new Person(i,arry[i]);
            q.offer(p);
        }
        while(!q.isEmpty()){
            Person curr=q.poll();
            for(Person x:q){
                if(x.danger>curr.danger){
                    q.offer(curr);
                    curr=null;
                    break;
                }
            }
            if(curr!=null){
                answer++;
                if(curr.sequence==pick) return answer;
            }
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pick=sc.nextInt();
        int[]arry=new int[num];
        for(int i=0;i<num;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(num,pick,arry));
    }
}

