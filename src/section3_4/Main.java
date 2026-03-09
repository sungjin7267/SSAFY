package section3_4;
import java.util.*;

public class Main {
    public int[] solution(int num){
        int[]answer=new int[num];
        for(int i=0;i<num;i++){
            if(i==0||i==1){
                answer[i]=1;
            }else{
                answer[i]=answer[i-1]+answer[i-2];
            }
        }
        return answer;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Main T=new Main();
        for(int x:T.solution(num)){
            System.out.print(x+" ");
        }
    }
}
