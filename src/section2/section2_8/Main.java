package section2.section2_8;
import java.util.*;
public class Main {
   /* public static boolean isAlpha(char c){
        if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
            return true;
        }else return false;
    }
    public String solution(String str){
        boolean answer=true;
        str=str.toLowerCase();
        char[]c=str.toCharArray();
        int lp=0, rp=str.length()-1;
        while(lp<rp){
            if(isAlpha(c[lp])){
                if(isAlpha(c[rp])){
                    if(c[lp]==c[rp]){
                        lp++;
                        rp--;
                    }
                    else {
                        answer=false;
                        break;
                    }
                }else rp--;
            }else lp++;
        }
        if(answer){
            return "YES";
        }
        else return "NO";
    }*/
    public String solution(String str){
        str=str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            return "YES";
        }else return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}
