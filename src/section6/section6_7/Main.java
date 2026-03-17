package section6.section6_7;
import java.util.*;

public class Main {
    public String solution(String cur,String str){
        String answer="NO";
        Queue<Character>q1=new LinkedList<>();
        for(char x:str.toCharArray()){
            q1.offer(x);
        }
        Queue<Character>q2=new LinkedList<>();
        for(char x:cur.toCharArray()){
            q2.offer(x);
        }
        while(!q2.isEmpty()){
           char c=q2.poll();
           while(c!=q1.peek()) q1.poll();
        }
        if(q1.equals(q2)) return "NO";
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String cur=sc.nextLine();
        String str=sc.nextLine();
        Main T=new Main();
        System.out.println(T.solution(cur,str));
    }
}
