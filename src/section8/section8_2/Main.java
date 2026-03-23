package section8.section8_2;
import java.util.*;

public class Main {
    public void DFS(int num){
        int answer=num%2;
        if(num==0) return;
        else{
            DFS(num/2);
            System.out.print(answer);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Main T=new Main();
        T.DFS(num);
    }
}
