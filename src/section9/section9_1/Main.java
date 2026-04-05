package section9.section9_1;
import java.util.*;

public class Main {
    static int arry[],check[],num,total;
    static String answer="NO";
    public void DFS(int index){
        if(answer.equals("YES")) return;
        if(index==num){
            int add=0;
            for(int i=0;i<num;i++){
                if(check[i]==1) add+=arry[i];
            }
            if(add==total/2&&total%2==0){
                answer="YES";
            }
        }else{
            check[index]=0;
            DFS(index+1);
            check[index]=1;
            DFS(index+1);
        }
    }
    public static void main(String[]args){
        Main T=new Main();
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        arry=new int[num];
        check=new int[num];
        for(int i=0;i<num;i++){
            arry[i]=sc.nextInt();
            total+=arry[i];
        }
        T.DFS(0);
        System.out.println(answer);
    }
}
