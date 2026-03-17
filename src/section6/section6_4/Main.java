package section6.section6_4;
import java.util.*;

public class Main {
    public int solution(String str){
        int answer=0;
        Stack<Integer>stack=new Stack<>();
        for(char x:str.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x-48);
            }else{
                int rt=stack.pop();
                int lt=stack.pop();
                switch(x){
                    case '+': stack.push(lt+rt); break;
                    case '-': stack.push(lt-rt); break;
                    case '*': stack.push(lt*rt); break;
                    case '/': if(lt!=0)stack.push(lt/rt); break;
                }
            }
        }
        answer=stack.get(0);
        return answer;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Main T=new Main();
        System.out.println(T.solution(str));
    }
}
