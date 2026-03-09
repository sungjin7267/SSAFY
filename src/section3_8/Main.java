package section3_8;
import java.util.*;

public class Main {
    public int[] solution(int num,int[]numArray){
        int[] answer=new int[num];
        for(int i=0;i<num;i++){
            int score=1;
            for(int j=0;j<num;j++){
                if(numArray[i]<numArray[j]){
                    score++;
                }
                answer[i]=score;
            }
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numArray[]=new int[num];
        for(int i=0;i<num;i++){
            numArray[i]=sc.nextInt();
        }
        Main T=new Main();
        for(int x:T.solution(num,numArray)){
            System.out.print(x+" ");
        }
    }
}
