package section6.section6_2;
import java.util.*;

public class Main {
    public ArrayList<Character>solution(String str){
        Stack<Character>stack=new Stack<>();
        ArrayList<Character>answer=new ArrayList<>();
        for(char x:str.toCharArray()){
            if(stack.isEmpty()){
                if(x=='(') stack.push(x);
                else answer.add(x);
            }else{
                if(x==')'){
                    while(true){
                        char curr=stack.pop();
                        if(curr=='('){
                            break;
                        }
                    }
                }else stack.push(x);
            }
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Main T=new Main();
        for(char x:T.solution(str)){
            System.out.print(x);
        }
    }
}
