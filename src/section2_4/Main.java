package section2_4;
import java.util.*;

public class Main {
    /*public String solution(String str){
        char array[]=str.toCharArray();
        String answer="";
        for(int i=0;i<array.length;i++){
            answer+=array[array.length-1-i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T= new Main();
        Scanner kb=new Scanner(System.in);
        int num=Integer.parseInt(kb.nextLine());
        for(int i=0;i<num;i++){
            String str=kb.nextLine();
            System.out.println(T.solution(str));
        }
    }*/
    public ArrayList<String> solution(int n, String[]str){
        ArrayList<String> answer= new ArrayList<>();
        for(String x: str) {
            String tmp=new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T=new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray=new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i]=sc.next();
        }
        for(String x: T.solution(n,strArray)){
            System.out.println(x);
        }
    }
}
