package section5.section5_3;
import java.util.*;

public class Main {
    public int[] solution(int day, int num,int[]numArray){
        HashMap<Integer,Integer>map=new HashMap<>();
        int answer[]=new int[day-num+1];
        int lt=0,rt=num,index=1;
        for(int i=lt;i<rt;i++){
            map.put(numArray[i],map.getOrDefault(numArray[i],0)+1);
        }
        answer[0]=map.size();
        while(rt<day){
            map.put(numArray[lt],map.getOrDefault(numArray[lt],0)-1);
            if(map.get(numArray[lt])==0){
                map.remove(numArray[lt]);
            }
            map.put(numArray[rt],map.getOrDefault(numArray[rt],0)+1);
            answer[index]=map.size();
            lt++;rt++;index++;
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int num=sc.nextInt();
        int numArray[]=new int[day];
        for(int i=0;i<day;i++){
            numArray[i]=sc.nextInt();
        }
        Main T=new Main();
        for(int x:T.solution(day,num,numArray)){
            System.out.print(x+" ");
        }
    }
}
