package section2.section2_12;
import java.util.*;

public class Main {
    public String solution(String str, int num){
        String answer="";
        for(int i=0;i<num;i++){
            String s=str.substring(i*7,(i+1)*7);
            s=s.replaceAll("#","1").replaceAll("\\*","0");
            char trans=(char)(Integer.parseInt(s,2));
            answer+=trans;
        }
        return answer;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        String str=sc.nextLine();
        Main T=new Main();
        System.out.println(T.solution(str,num));
    }
}
