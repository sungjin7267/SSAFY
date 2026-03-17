package section6.section6_6;
import java.util.*;

public class Main {
    public int solution(int man,int num){
        Queue<Integer>queue=new LinkedList<>();
        int answer=0;
        for(int i=1;i<=man;i++){ //원형 리스트 생성
            queue.offer(i);
        }
        int cnt=1;
        while(queue.size()>1){//앞에 두개는 뒤로 이어 붙임.
            if(cnt!=num){
                queue.offer(queue.poll());
                cnt++;
            }else{
                cnt=1;
                queue.poll(); //num에 있는 수 빼기
            }
        }
        answer=queue.poll();
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int man=sc.nextInt();
        int num=sc.nextInt();
        Main T=new Main();
        System.out.println(T.solution(man,num));
    }
}
