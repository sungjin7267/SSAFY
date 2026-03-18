package section7.section7_3;
import java.util.*;
public class Main {
    public int[]solution(int num,int[]arry){
        /*for(int i=1;i<num;i++){
            int idx=i;
            for(int j=i-1;j>=0;j--){
                if(arry[idx]<arry[j]) {
                    int tmp=arry[idx];
                    arry[idx]=arry[j];
                    arry[j]=tmp;
                    idx=j;
                }
            }
        }
        return arry;*/
        for(int i=1;i<num;i++){
            int tmp=arry[i],j;
            for(j=i-1;j>=0;j--){
                if(arry[j]>tmp) arry[j+1]=arry[j];
                else break;
            }
            arry[j+1]=tmp;
        }
        return arry;
    }
    public static void main(String[]args){
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
