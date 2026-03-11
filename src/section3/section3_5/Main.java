package section3.section3_5;
import java.util.*;

public class Main {
    public int solution(int num){
        int numArray[]=new int[num+1];
        int answer=0;
        for(int i=2;i<=num;i++){
            if(numArray[i]==0){
                answer++;
                for(int j=i;j<=num;j=j+i){
                    numArray[j]=1;
                }
            }
        }
        return answer;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Main T=new Main();
        System.out.println(T.solution(num));
    }
}
