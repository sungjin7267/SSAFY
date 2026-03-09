package section4_5;
import java.util.*;
public class Main {
    public int solution(int num){
        int answer=0,tmp=0,lt=1;
        for(int i=1;i<num;i++){
            tmp+=i;
            if(tmp==num) answer++;
            while(tmp>num){
                tmp-=lt;
                lt++;
                if(tmp==num) answer++;
            }
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Main T=new Main();
        System.out.println(T.solution(num));
    }
}
