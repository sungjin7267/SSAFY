package section7.section7_1;
import java.util.*;

public class Main {
    public int[] solution(int num,int arry[]){
        for(int i=0;i<num;i++){
            int min=arry[i],idx=i;
            for(int j=i+1;j<num;j++){
                if(arry[j]<min){
                    min=arry[j];
                    idx=j;
                }
            }
            int tmp=arry[idx];
            arry[idx]=arry[i];
            arry[i]=tmp;
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
        for(int x:T.solution(num,arry)){
            System.out.print(x+" ");
        }
    }
}
