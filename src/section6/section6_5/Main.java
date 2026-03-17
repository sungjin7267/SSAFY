package section6.section6_5;
import java.util.*;

public class Main {
    public int solution(String str){
        Stack<Character>stack=new Stack<>();
        char tmp=' '; //이전 상태
        int answer=0;
        for(char x:str.toCharArray()){
            if(x=='('){
                stack.push(x);
            }else{
                stack.pop();
                if(tmp=='(') answer+=stack.size();
                else answer+=1;
            }
            tmp=x;
        }
        return answer;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Main T=new Main();
        System.out.println(T.solution(str));
    }
}
