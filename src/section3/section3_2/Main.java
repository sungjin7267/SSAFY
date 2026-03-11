package section3.section3_2;
import java.util.*;

public class Main {
    public int solution(int[]numArray){
        int answer=0;
        int max=0;
        for(int i=0;i<numArray.length;i++){
            if(max<numArray[i]){
                answer++;
                max=numArray[i];
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        int numArray[]=new int [num];
        for(int i=0;i<num;i++){
            numArray[i]=Integer.parseInt(sc.next());
        }
        Main T=new Main();
        System.out.println(T.solution(numArray));
    }
}
