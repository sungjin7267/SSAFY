package section8.section8_3;
import java.util.*;

public class Main {
    public int DFS(int num){
        if(num==1){
            return 1;
        }else{
            return num*DFS(num-1);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Main T=new Main();
        System.out.println(T.DFS(num));
    }
}
