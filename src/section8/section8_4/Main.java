package section8.section8_4;
import java.util.*;

public class Main {
    static int[] fibo;
    public int DFS(int num){
        if(fibo[num]>0) return fibo[num];
        if(num==1||num==2){
            return fibo[num]=1;
        }else{
            return fibo[num]=DFS(num-2)+DFS(num-1);
        }
    }
    public static void main(String[]args){
        long start = System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fibo=new int[num+1];
        Main T=new Main();
        for(int i=1;i<=num;i++){
            System.out.print(T.DFS(i)+" ");
        }
        long end = System.currentTimeMillis();
        System.out.println("걸린 시간: " + (end - start) + "ms");
    }
}
