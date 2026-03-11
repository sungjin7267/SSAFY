package section4.section4_3;
import java.util.*;

public class Main {
    public int solution(int num,int day,int[]arry){
        int p1=0,p2=day,start=0,max=Integer.MIN_VALUE;
        for(int i=0;i<day;i++){
            start+=arry[i];
            max=start;
        }
        while(p2<=num-1){
            start=start-arry[p1++]+arry[p2++];
            if(start>max){
                max=start;
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int day=sc.nextInt();
        int arry[]=new int[num];
        for(int i=0;i<num;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(num,day,arry));
    }
}
