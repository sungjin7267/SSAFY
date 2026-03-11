package section2.section2_11;
import java.util.*;

public class Main {
    public String solution(String str){
        /*char []c=str.toCharArray();
        char alpha=str.charAt(0);
        int count=0;
        String answer="";
        for(int i=0;i<str.length();i++){
            if(c[i]==alpha){
                if(count==0){
                    answer+=alpha;
                }
                count++;
                if(i==str.length()-1){
                    answer+=count;
                }
            }else{
                if(count!=1){
                    answer+=count;
                }
                count=1;
                alpha=c[i];
                answer+=alpha;
            }
        }
        return answer;*/

        String answer="";
        str+=" ";
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)) count++;
            else{
                answer+=str.charAt(i);
                if(count>1){
                    answer+=count;
                }
                count=1;
            }
        }
        return answer;
    }
    public static void main(String []args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(T.solution(str));
    }
}
