package section6.section6_7;
import java.util.*;

public class Main {
    public String solution(String cur,String str){
        String answer="YES";
        Queue<Character>q=new LinkedList<>();
        for(char x:cur.toCharArray()){
            q.offer(x);
        }
        for(char x: str.toCharArray()){
            if(q.contains(x)){ //str에 char하나씩 보면서 큐에 있는지 확인 있다면,
                if(x!=q.poll()){ //가장 앞이 아니라면
                    return "NO";
                }
            }
        }
        if(q.isEmpty()) return answer;
        else return "NO";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String cur=sc.nextLine();
        String str=sc.nextLine();
        Main T=new Main();
        System.out.println(T.solution(cur,str));
    }
}
