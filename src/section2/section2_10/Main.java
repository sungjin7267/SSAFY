package section2.section2_10;
import java.util.*;

public class Main {
    public void solution(String word, char alpha){
        int p=1000;
        int [] answer=new int[word.length()];
        for(int i=0;i<word.length();i++){
            p++;
            if(word.charAt(i)==alpha){
                p=0;
                answer[i]=p;
            }
            answer[i]=p;
        }
        p=1000;
        for(int i=word.length()-1;i>=0;i--){
            p++;
            if(word.charAt(i)==alpha){
                p=0;
                answer[i]=p;
            }
            answer[i]=Math.min(p,answer[i]);
        }
        for(int i=0;i<word.length();i++){
            if(i==word.length()-1){
                System.out.print(answer[i]);
            }else   System.out.print(answer[i]+" ");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.next();/*
        String str=sc.next();
        char alpha=Character.valueOf(str.charAt(0));*/
        char alpha=sc.next().charAt(0);
        Main T = new Main();
        T.solution(word, alpha);
    }
}
