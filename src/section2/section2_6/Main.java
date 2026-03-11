package section2.section2_6;

import java.util.*;
public class Main {
    public String solution(String str){
        /*ArrayList<Character> check=new ArrayList<>();
        char[] ch=str.toCharArray();
        String answer="";
        for(char x:ch){
            if(check.contains(x)==false){
                answer+=x;
                check.add(x);
            }
        }
        return answer;*/
        String answer="";
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==i){ //만약 처음 나오는 문자면 i와 같은 값을 반환
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        Main T=new Main();
        System.out.println(T.solution(str));
    }
}
