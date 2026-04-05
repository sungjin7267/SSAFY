package section9.section9_2;
import java.util.*;

public class Main {
    static int killo,num,arry[],check[],max=0;
    public void DFS(int index){
        if(index==num){
            int sum=0;
            for(int i=0;i<num;i++){
                if(check[i]==1) sum+=arry[i];
            }
            if(sum<killo&&sum>max){
                max=sum;
            }
        }else{
            check[index]=0;
            DFS(index+1);
            check[index]=1;
            DFS(index+1);
        }
    }
    public static void main(String args[]){
        Main T=new Main();
        Scanner sc=new Scanner(System.in);
        killo=sc.nextInt();
        num=sc.nextInt();
        arry=new int[num];
        check=new int[num];
        for(int i=0;i<num;i++){
            arry[i]=sc.nextInt();
        }
        T.DFS(0);
        System.out.println(max);
    }
}
