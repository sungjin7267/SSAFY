package section7.section7_5;
import java.util.*;

public class Main {
    public char solution(int num,int arry[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        char answer='U';
        for(int x:arry){
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)>1) return 'D';
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arry[]=new int[num];
        for(int i=0;i<num;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(num,arry));
    }
}
