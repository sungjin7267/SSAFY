package section2.section2_3;
import java.util.*;
public class Main {
    public String solution(String str){
        int max=Integer.MIN_VALUE;
        String answer=" ";
        for(String a:str.split(" ")){
            if(a.length()>max){
                max=a.length();
                answer=a;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String str= kb.nextLine();
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}
