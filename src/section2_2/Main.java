package section2_2;

import java.util.*;
public class Main {
    public String solution(String str) {
        String answer="";
        for( char x: str.toCharArray()) {
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        /*for(int i=0; i<str.length(); i++) {
            char c=str.charAt(i);
            if(c>=65&&c<=90) {
                answer+=Character.toLowerCase(c);
            }else if(c>=97&&c<=122) {
                answer+=Character.toUpperCase(c);
            }
        }*/
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb= new Scanner(System.in);
        String str= kb.next();
        System.out.println(T.solution(str));
    }
}
