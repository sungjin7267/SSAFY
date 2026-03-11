package section4.section4_4;
import java.util.*;

public class Main {
    public int solution(int index,int num,int[]arry){
        int answer=0,lt=0,tmp=0;
        for(int rt=0;rt<index;rt++){
            tmp+=arry[rt];
            if(tmp==num) answer++;
            while(tmp>num){
                tmp-=arry[lt];
                lt++;
                if(tmp==num) answer++;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        int num=sc.nextInt();
        int arry[]=new int[index];
        for(int i=0;i<index;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(index,num,arry));
    }
}
