package section8.section8_1;
import java.util.*;

public class Main {
    public void solution(int n){
        if(n==0) return;
        else{
            solution(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Main T=new Main();
        T.solution(n);
    }
}
