package section2.section2_5;
import java.util.*;

public class Main {
    public String solution(String str) {
        String answer="";
        char c[]=str.toCharArray();
        int lp=0, rp=str.length()-1;
        while(lp<rp) {
            if((c[lp]>='a'&&c[lp]<='z')||(c[lp]>='A'&&c[lp]<='Z')) {
                if((c[rp]>='a'&&c[rp]<='z')||(c[rp]>='A'&&c[rp]<='Z')) {
                    char temp=c[lp];
                    c[lp]=c[rp];
                    c[rp]=temp;
                    lp++;
                    rp--;
                }else{
                    rp--;
                }
            }else{
                lp++;
            }
        }
        answer=String.valueOf(c);
        return answer;
    }
    public static void main(String[] args) {
        Main T=new Main();
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(T.solution(str));
    }
}
