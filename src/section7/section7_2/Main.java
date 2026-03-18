package section7.section7_2;
import java.util.*;

public class Main {
    public int[]solution(int num,int[]arry){
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-1-i;j++){
                if(arry[j]>arry[j+1]){
                    int tmp=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=tmp;
                }
            }
        }
        return arry;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arry[]=new int[num];
        for(int i=0;i<num;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        for(int x:T.solution(num,arry)) {
            System.out.print(x+" ");
        }
    }
}
