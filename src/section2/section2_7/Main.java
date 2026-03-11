package section2.section2_7;

import java.util.*;
public class Main {
    public String solution(String str){
    /*    str = str.toLowerCase();
        String answer="YES";
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return "NO";
            }
        }
        return answer;
    */
        String compare=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(compare)){
            return "YES";
        }else return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Main T= new Main();
        System.out.println(T.solution(str));
    }
}
