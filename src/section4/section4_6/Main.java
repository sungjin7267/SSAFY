package section4.section4_6;
import java.util.*;

public class Main {
    public int solution(int index, int chance,int arry[]){
/*        int answer=0,max=Integer.MIN_VALUE;
        for(int i=0;i<index;i++){
            int cnt=chance, tmp=0;
            for(int j=i;j<index;j++){
                if(arry[j]==1){
                    tmp++;
                }
                if(arry[j]==0){
                    if(cnt!=0){
                        tmp++;
                        cnt--;
                    }
                    else {
                        max=Math.max(tmp,max);
                        break;
                    }
                }
            }
        }
        answer=max;
        return answer;*/
        int answer=0,max=0,cnt=0,lt=0;
        for(int i=0;i<index;i++){
            if(arry[i]==0){
                cnt++;
            }
            while(cnt>chance){
                if(arry[lt]==0){
                    cnt--;
                }lt++;
            }
            if(cnt==chance){
                if(max<i-lt+1){
                    max=i-lt+1;
                }
            }
        }
        answer=max;
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        int arry[]=new int[index];
        int chance=sc.nextInt();
        for(int i=0;i<index;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(index,chance,arry));
    }
}
