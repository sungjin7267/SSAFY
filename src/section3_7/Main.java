package section3_7;
import java.util.*;

public class Main {
    public int solution(int num,int[]numArray){
        int answer=0;
        int score=0;
        for(int i=0;i<num;i++){
            if(numArray[i]==1){
                score++;
                answer+=score;
            }else score=0;
        }
        return answer;
    }
    public static void main(String []agrs){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numArray[]=new int[num];
        for(int i=0;i<num;i++){
            numArray[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(num,numArray));
    }
}
