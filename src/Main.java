import java.util.*;
class Main {
    public int solution(String str, char a){
        int answer=0;
        str=str.toUpperCase();
        a= Character.toUpperCase(a);
        for(char c: str.toCharArray()){
            if(c==a) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb= new Scanner(System.in);
        String str=kb.next();
        char a= kb.next().charAt(0);
        System.out.println(T.solution(str,a));
    }
}