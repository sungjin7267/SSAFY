package section2.section2_9;
import java.util.*;
public class Main {
    public int solution(String str){/*
        if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')){
            return true;
        }else return false;
    }
    public int solution(String str){
        char []c=str.toCharArray();
        String answer="";
        for(char x: c){
            if(!isAlpha(x)){
                answer+=x;
            }
        }
        return Integer.parseInt(answer);*/
        String answer="";
        for(char x:str.toCharArray()){
            if(Character.isDigit(x)){
                answer+=x;
            }
        }
        return Integer.parseInt(answer);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        Main T=new Main();
        System.out.println(T.solution(str));
    }
}
