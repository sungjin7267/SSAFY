package section6.section6_1;
import java.util.*;

public class Main {
    public String solution(String str){
        String answer="YES";
        Stack<Character>stack=new Stack<>();
        for(char c:str.toCharArray()){
            if(stack.isEmpty()){
                if(c=='('){
                    stack.push(c);
                }else return "NO";
            }else{
                if(c=='('){
                    stack.push(c);
                }else{
                    char curr=stack.pop();
                    if(curr==')'){
                        return "NO";
                    }
                }
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Main T=new Main();
        System.out.println(T.solution(str));
    }
}
